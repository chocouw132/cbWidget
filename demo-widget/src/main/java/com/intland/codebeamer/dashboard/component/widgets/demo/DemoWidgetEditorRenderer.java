package com.intland.codebeamer.dashboard.component.widgets.demo;

import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.intland.codebeamer.dashboard.component.common.RenderingContextFactory;
import com.intland.codebeamer.dashboard.component.widgets.common.DefaultWidgetEditorRenderer;
import com.intland.codebeamer.dashboard.component.widgets.common.ModelPopulator;
import com.intland.codebeamer.dashboard.component.widgets.common.attribute.WidgetAttribute;
import com.intland.codebeamer.dashboard.component.widgets.common.editor.FormLayoutEditorFooter;
import com.intland.codebeamer.utils.TemplateRenderer;

@Component
@Qualifier("demoWidgetEditorRenderer")
public class DemoWidgetEditorRenderer extends DefaultWidgetEditorRenderer<DemoWidget> {

	@Autowired
	public DemoWidgetEditorRenderer(final ModelPopulator<VelocityContext> modelPopulator,
			final TemplateRenderer templateRenderer, final FormLayoutEditorFooter formLayoutEditorFooter,
			final RenderingContextFactory renderingContextFactory) {
		super(modelPopulator, templateRenderer, formLayoutEditorFooter,
				renderingContextFactory);
	}

	@Override
	protected Map<String, WidgetAttribute> getDescriptor() {
		return DemoWidget.getDescriptor();
	}

}
