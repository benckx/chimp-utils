package be.encelade.chimp.utils

import com.jme3.math.Vector2f
import com.jme3.math.Vector3f
import com.jme3.math.Vector4f

object VectorOperatorUtils {

    // plus
    operator fun Vector2f.plus(other: Vector2f): Vector2f = this.add(other)
    operator fun Vector3f.plus(other: Vector3f): Vector3f = this.add(other)
    operator fun Vector4f.plus(other: Vector4f): Vector4f = this.add(other)

    // plus other types
    operator fun Vector3f.plus(other: Vector2f): Vector3f = this.add(Vector3f(other.x, other.y, 0f))

    // minus
    operator fun Vector2f.minus(other: Vector2f): Vector2f = this.minus(other)
    operator fun Vector3f.minus(other: Vector3f): Vector3f = this.minus(other)
    operator fun Vector4f.minus(other: Vector4f): Vector4f = this.minus(other)

    // multiplication
    operator fun Vector3f.times(other: Vector3f): Vector3f = this.mult(other)
    operator fun Vector4f.times(other: Vector4f): Vector4f = this.mult(other)

    // multiplication scalar
    operator fun Vector2f.times(scalar: Float): Vector2f = this.mult(scalar)
    operator fun Vector3f.times(scalar: Float): Vector3f = this.mult(scalar)
    operator fun Vector4f.times(scalar: Float): Vector4f = this.mult(scalar)

    // divide scalar
    operator fun Vector2f.div(scalar: Float): Vector2f = this.divide(scalar)
    operator fun Vector3f.div(scalar: Float): Vector3f = this.divide(scalar)
    operator fun Vector4f.div(scalar: Float): Vector4f = this.divide(scalar)

}
