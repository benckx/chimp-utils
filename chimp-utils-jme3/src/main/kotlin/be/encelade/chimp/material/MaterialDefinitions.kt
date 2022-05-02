package be.encelade.chimp.material

import com.jme3.asset.AssetKey
import com.jme3.asset.AssetManager
import com.jme3.material.MaterialDef
import com.jme3.material.Materials

object MaterialDefinitions {

    lateinit var unshadedDef: MaterialDef
    lateinit var lightingDef: MaterialDef
    lateinit var pbrDef: MaterialDef

    fun load(assetManager: AssetManager) {
        unshadedDef = assetManager.loadAsset<Any?>(AssetKey(Materials.UNSHADED)) as MaterialDef
        lightingDef = assetManager.loadAsset<Any?>(AssetKey(Materials.LIGHTING)) as MaterialDef
        pbrDef = assetManager.loadAsset<Any?>(AssetKey(Materials.PBR)) as MaterialDef
    }

}
