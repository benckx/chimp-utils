package be.encelade.chimp.utils

import be.encelade.chimp.utils.VectorOperatorUtils.plus

import com.jme3.math.Vector3f
import org.junit.Assert.assertEquals
import org.junit.Test

class VectorOperatorUtilsTest {

    @Test
    fun vectorOperatorTest01() {
        val v1 = Vector3f(2f, 1f, 1f)
        val v2 = Vector3f(4f, 4f, 4f)
        val sum = v1 + v2

        assertEquals(Vector3f(6f, 5f, 5f), sum)
    }

}
