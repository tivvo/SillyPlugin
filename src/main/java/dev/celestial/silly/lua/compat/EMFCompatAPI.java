package dev.celestial.silly.lua.compat;

import net.minecraft.world.entity.Entity;
import org.figuramc.figura.lua.FiguraLuaRuntime;
import org.figuramc.figura.lua.LuaNotNil;
import org.figuramc.figura.lua.LuaWhitelist;

import org.luaj.vm2.LuaTable;
import traben.entity_model_features.EMFAnimationApi;
import traben.entity_model_features.models.IEMFModel;
import traben.entity_model_features.models.animation.EMFAnimationEntityContext;
import traben.entity_model_features.models.parts.EMFModelPart;
import traben.entity_model_features.utils.EMFEntity;

@LuaWhitelist
public class EMFCompatAPI extends BaseCompatAPI {
    public EMFCompatAPI(FiguraLuaRuntime runtime) {
        super(runtime);
    }

    @LuaWhitelist
    public int getApiVersion() {
        return (EMFAnimationApi.getApiVersion());
    }

    // okay, i think the best way to approach this is to rather
    // get the model off of the emfmodel and get the parts from there so we're gonna test a bit
    // tbh
    @LuaWhitelist
    public boolean doesEMFEntityExist(@LuaNotNil Entity checkEnt) {
        return (EMFAnimationApi.emfEntityOf(checkEnt) != null);
    }

    @LuaWhitelist
    public EMFEntity getCurrentEMFEntity() {
        return EMFAnimationApi.getCurrentEntity();
    }

    @LuaWhitelist
    public void test() {

    }
}