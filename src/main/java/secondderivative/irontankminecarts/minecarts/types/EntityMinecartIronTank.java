package secondderivative.irontankminecarts.minecarts.types;

import com.indemnity83.irontank.reference.TankType;

import net.minecraft.world.World;
import secondderivative.irontankminecarts.minecarts.EntityMinecartTankAbstract;

public class EntityMinecartIronTank extends EntityMinecartTankAbstract {
    
    private static TankType type = TankType.IRON;

    public EntityMinecartIronTank(World world) {
        super(world, type);
    }

    public EntityMinecartIronTank(World world, double x, double y, double z) {
        super(world, x, y, z, type);
    }

    @Override
    public TankType type() {
        return type;
    }
    @Override
    public int getCapacity() {
        return EntityMinecartTankAbstract.getCapacity(type);
    }
}
