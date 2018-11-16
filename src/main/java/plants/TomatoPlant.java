package plants;

import Interfaces.Edible;
import edibles.Tomato;

public class TomatoPlant extends Crop {


    public Edible yields() {
        if (this.getHasBeenHarvested() && this.getHasBeenFertilized() == false)
        {
            return new Tomato();
        }
      else   return null;
    }
}
