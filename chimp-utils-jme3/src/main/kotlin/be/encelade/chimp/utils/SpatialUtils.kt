package be.encelade.chimp.utils

import com.jme3.math.Vector3f
import com.jme3.scene.Spatial

object SpatialUtils {

    fun Spatial.rotate(vector: Vector3f) {
        this.rotate(vector.x, vector.y, vector.z)
    }

}
