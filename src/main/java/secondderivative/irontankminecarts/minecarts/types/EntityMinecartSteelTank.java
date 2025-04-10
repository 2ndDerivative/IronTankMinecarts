package secondderivative.irontankminecarts.minecarts.types;

import com.indemnity83.irontank.reference.TankType;

import net.minecraft.world.World;
import secondderivative.irontankminecarts.minecarts.EntityMinecartTankAbstract;

public class EntityMinecartSteelTank extends EntityMinecartTankAbstract {
    
    private static TankType type = TankType.SILVER;

    public EntityMinecartSteelTank(World world) {
        super(world, type);
    }

    public EntityMinecartSteelTank(World world, double x, double y, double z) {
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
