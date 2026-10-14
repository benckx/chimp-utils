package be.encelade.chimp.tpf

import java.time.Duration
import org.junit.Assert.assertEquals
import org.junit.Test

class TpfAccumulatorTest {
    @Test
    fun subsecondDurationDoesNotFireEarly() {
        var calls = 0
        val timer = TpfAccumulator(Duration.ofMillis(500)) { calls++ }
        timer.simpleUpdate(.25f)
        assertEquals(0, calls)
        timer.simpleUpdate(.25f)
        assertEquals(1, calls)
        timer.simpleUpdate(1f)
        assertEquals(1, calls)
    }

    @Test
    fun fractionalPartOfLongerDurationIsPreserved() {
        var calls = 0
        val timer = TpfAccumulator(Duration.ofMillis(1500)) { calls++ }
        timer.simpleUpdate(1f)
        assertEquals(0, calls)
        timer.simpleUpdate(.5f)
        assertEquals(1, calls)
    }
}
