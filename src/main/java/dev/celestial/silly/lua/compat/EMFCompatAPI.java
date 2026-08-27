package dev.celestial.silly.lua.compat;

import net.minecraft.client.Minecraft;
import org.figuramc.figura.lua.FiguraLuaRuntime;
import org.figuramc.figura.lua.LuaWhitelist;

import traben.entity_model_features.EMFAnimationApi;

import net.minecraft.world.entity.player.Player;
import traben.entity_model_features.models.parts.EMFModelPart;
import traben.entity_model_features.models.parts.EMFModelPartCustom;
import traben.entity_model_features.utils.EMFEntity;

@LuaWhitelist
public class EMFCompatAPI extends BaseCompatAPI {
    public EMFCompatAPI(FiguraLuaRuntime runtime) {
        super(runtime);
    }

    // emf to require anything requires the original entity
    // in terms of how the entity is stored in emf for the player
    // it's like usual
    Player clientPlayer = Minecraft.getInstance().player;
    EMFEntity emfPlayer = EMFAnimationApi.emfEntityOf(clientPlayer);

    @LuaWhitelist
    public int getApiVersion() {

        return (EMFAnimationApi.getApiVersion());
    }

    @LuaWhitelist
    public double getEntityXPos() {
        return (emfPlayer.emf$getX());
    }

}
