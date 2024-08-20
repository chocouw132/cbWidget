package com.intland.codebeamer.dashboard.component.widgets.demo;

import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.InjectableValues;
import com.intland.codebeamer.dashboard.component.common.interfaces.Renderer;
import com.intland.codebeamer.dashboard.component.common.interfaces.WidgetFactory;
import com.intland.codebeamer.dashboard.component.widgets.common.attribute.WidgetAttribute;
import com.intland.codebeamer.dashboard.component.widgets.common.attribute.WidgetAttributeMapper;

/**
 * @author <a href="mailto:mark.szabo@intland.com">Mark Szabo</a>
 *
 */
@Component
@Qualifier("demoWidgetFactory")
public class DemoWidgetFactory implements WidgetFactory<DemoWidget> {

	private final Renderer<DemoWidget> htmlRenderer;
	private final Renderer<DemoWidget> editorRenderer;
	private final WidgetAttributeMapper widgetAttributeMapper;

	@Autowired
	public DemoWidgetFactory(@Qualifier("demoWidgetHtmlRenderer") final Renderer<DemoWidget> htmlRenderer,
			@Qualifier("demoWidgetEditorRenderer") final Renderer<DemoWidget> editorRenderer,
			final WidgetAttributeMapper widgetAttributeMapper) {
		this.htmlRenderer = htmlRenderer;
		this.editorRenderer = editorRenderer;
		this.widgetAttributeMapper = widgetAttributeMapper;
	}

	public InjectableValues getInjectableValues() {
    	final InjectableValues inject = new InjectableValues.Std()
		.addValue("demoWidgetHtmlRenderer", htmlRenderer)
		.addValue("demoWidgetEditorRenderer",editorRenderer);
    	return inject;
	}

	public Class<DemoWidget> getType() {
		return DemoWidget.class;
	}

	public String getTypeName() {
		return DemoWidget.class.getCanonicalName();
	}

	public DemoWidget createInstance() {
		return new DemoWidget(UUID.randomUUID().toString(), DemoWidget.getDescriptor(), htmlRenderer, editorRenderer);
	}

	public DemoWidget createInstance(final String id, final Map<String, String> attributes) {
		return createInstance(id, attributes, true);
	}

	public DemoWidget createInstance(final String id, final Map<String, String> attributes, final boolean validate) {
		final Map<String, WidgetAttribute> widgetAttributes = widgetAttributeMapper.map(attributes, DemoWidget.getDescriptor(), validate);

		return new DemoWidget(id, widgetAttributes, htmlRenderer, editorRenderer);
	}

}
