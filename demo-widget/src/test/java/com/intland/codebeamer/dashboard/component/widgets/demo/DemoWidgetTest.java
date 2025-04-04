package com.intland.codebeamer.dashboard.component.widgets.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoWidgetTest {

    @Test
    public void testGreetingKey() {
        assertEquals("greeting", DemoWidget.Attribute.GREETING.getKey());
    }

    @Test
    public void testGreetingDefaultValueNotNull() {
        assertNotNull(DemoWidget.Attribute.GREETING.getDefaultValue());
    }
}
