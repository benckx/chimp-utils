package be.encelade.chimp.utils

import com.jme3.math.Vector2f
import com.jme3.math.Vector3f
import com.jme3.math.Vector4f

object VectorOperatorUtils {

    operator fun Vector2f.plus(other: Vector2f): Vector2f = this.add(other)

    operator fun Vector3f.plus(other: Vector3f): Vector3f = this.add(other)

    operator fun Vector4f.plus(other: Vector4f): Vector4f = this.add(other)

    operator fun Vector3f.minus(other: Vector3f): Vector3f = this.minus(other)

    operator fun Vector3f.plus(other: Vector2f): Vector3f = this.add(Vector3f(other.x, other.y, 0f))

    operator fun Vector3f.times(other: Vector3f): Vector3f = this.mult(other)

    operator fun Vector2f.times(scalar: Float): Vector2f = this.mult(scalar)

    operator fun Vector3f.times(scalar: Float): Vector3f = this.mult(scalar)

    operator fun Vector4f.times(other: Vector4f): Vector4f = this.mult(other)

    operator fun Vector4f.times(scalar: Float): Vector4f = this.mult(scalar)

}
