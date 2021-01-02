package be.encelade.chimp.mesh

import com.jme3.math.Vector3f
import com.jme3.scene.Mesh
import com.jme3.scene.VertexBuffer
import com.jme3.util.BufferUtils

class IsoscelesRightTriangle(size: Float) : Mesh() {

    init {
        val side = size / 2

        val vertices = arrayOfNulls<Vector3f>(3)
        vertices[0] = Vector3f(0f, 0f, 0f)
        vertices[1] = Vector3f(side, 0f, 0f)
        vertices[2] = Vector3f(0f, side, 0f)
        val indexes = shortArrayOf(0, 1, 2)

        setBuffer(VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(*vertices))
        setBuffer(VertexBuffer.Type.Index, 1, BufferUtils.createShortBuffer(*indexes))
        updateBound()
    }

}
