package sugar.free.sightparser.applayer.status_param;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import sugar.free.sightparser.applayer.status_param.blocks.SystemIdentificationBlock;
import sugar.free.sightparser.pipeline.ByteBuf;

public abstract class StatusBlock implements Serializable {


    public static final Map<Short, Class<? extends StatusBlock>> STATUSBLOCKS = new HashMap<>();

    static {
        STATUSBLOCKS.put(SystemIdentificationBlock.ID, SystemIdentificationBlock.class);
    }

    public abstract short getID();
    public abstract void parse(ByteBuf byteBuf);
    public abstract byte[] getData();

}
