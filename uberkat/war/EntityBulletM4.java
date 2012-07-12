package uberkat.war;

import java.util.Random;
import net.minecraft.server.*;

public class EntityBulletM4 extends EntityBullet
{
    public EntityBulletM4(World world)
    {
        super(world);
    }

    public EntityBulletM4(World world, double d, double d1, double d2)
    {
        super(world, d, d1, d2);
    }

    public EntityBulletM4(World world, Entity entity, ItemGun itemgun, float f, float f1, float f2, float f3, float f4)
    {
        super(world, entity, itemgun, f, f1, f2, f3, f4);
    }

    public void playServerSound(World world)
    {
        world.makeSound(this, ((ItemGun)mod_ModernWarfare.itemGunM4).firingSound, ((ItemGun)mod_ModernWarfare.itemGunM4).soundRangeFactor, 1.0F / (random.nextFloat() * 0.1F + 0.95F));
    }
}
