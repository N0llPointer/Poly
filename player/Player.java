package player;

import weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new Bazuka(),
                new Pistol(),
                new Rifle(),
                new Shotgun(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public int getSlotsCount(){
        return weaponSlots.length;
    }

    public void showWithWeapon(int slot){
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }


}
