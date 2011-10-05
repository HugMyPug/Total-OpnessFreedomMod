package me.StevenLawson.TotalFreedomMod;

import java.util.Comparator;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class TFM_RadarData implements Comparator<TFM_RadarData>
{
    Player player;
    double distance;
    Location location;

    public TFM_RadarData(Player inplayer, double indistance, Location inlocation)
    {
        this.player = inplayer;
        this.distance = indistance;
        this.location = inlocation;
    }

    public TFM_RadarData()
    {
    }

    @Override
    public int compare(TFM_RadarData t1, TFM_RadarData t2)
    {
        if (t1.distance > t2.distance)
        {
            return 1;
        }
        else if (t1.distance < t2.distance)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}