package be.encelade.chimp.utils

import com.jme3.math.Vector2f
import com.jme3.math.Vector3f

object VectorOperatorUtils {

    operator fun Vector3f.plus(other: Vector3f): Vector3f = this.add(other)

    operator fun Vector3f.plus(other: Vector2f): Vector3f = this.add(Vector3f(other.x, other.y, 0f))

    operator fun Vector3f.times(other: Vector3f): Vector3f = this.mult(other)

    operator fun Vector3f.times(scalar: Float): Vector3f = this.mult(scalar)

}
