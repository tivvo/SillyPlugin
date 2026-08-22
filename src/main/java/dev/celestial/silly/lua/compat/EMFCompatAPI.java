package dev.celestial.silly.lua.compat;

import org.figuramc.figura.lua.FiguraLuaRuntime;
import org.figuramc.figura.lua.LuaWhitelist;
import traben.entity_model_features.EMFAnimationApi;

public class EMFCompatAPI extends BaseCompatAPI {
    public EMFCompatAPI(FiguraLuaRuntime runtime) {
        super(runtime);
    }

    @LuaWhitelist
    public int getApiVersion() {
        return (EMFAnimationApi.getApiVersion());
    }
}
