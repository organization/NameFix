package nameFix;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerPreLoginEvent;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onPreLogin(PlayerPreLoginEvent event) {

		if (event.getPlayer().getName().contains(" ")) {
			event.setKickMessage("닉네임에 띄어쓰기가 포함되어있습니다");
			event.setCancelled();
		}
	}
}
