package nova.internal.core.depmodules;

import nova.core.gui.factory.GuiComponentFactory;
import nova.core.gui.factory.GuiManager;
import se.jbee.inject.bind.BinderModule;

class GuiModule extends BinderModule {

	@Override
	protected void declare() {
		require(GuiComponentFactory.class);
		require(GuiManager.class);
	}

}
