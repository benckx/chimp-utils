package be.encelade.chimp.utils

import com.jme3.math.FastMath.DEG_TO_RAD
import com.jme3.scene.Spatial

object SpatialHelperUtils {

    /**
     * In radian
     */
    fun Spatial.moveX(x: Float) = this.move(x, 0f, 0f)

    /**
     * In radian
     */
    fun Spatial.moveY(y: Float) = this.move(0f, y, 0f)

    /**
     * In radian
     */
    fun Spatial.moveZ(z: Float) = this.move(0f, 0f, z)

    /**
     * In radian
     */
    fun Spatial.rotateX(x: Float) = this.rotate(x, 0f, 0f)

    /**
     * In radian
     */
    fun Spatial.rotateY(y: Float) = this.rotate(0f, y, 0f)

    /**
     * In radian
     */
    fun Spatial.rotateZ(z: Float) = this.rotate(0f, 0f, z)

    /**
     * In degree
     */
    fun Spatial.rotateX(x: Int) = this.rotate(x * DEG_TO_RAD, 0f, 0f)

    /**
     * In degree
     */
    fun Spatial.rotateY(y: Int) = this.rotate(0f, y * DEG_TO_RAD, 0f)

    /**
     * In degree
     */
    fun Spatial.rotateZ(z: Int) = this.rotate(0f, 0f, z * DEG_TO_RAD)

}