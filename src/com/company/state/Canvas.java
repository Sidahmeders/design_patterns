package com.company.state;

public class Canvas {
    private ToolType currentTool;

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection Icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Eraser Icon");
        }
    }

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("draw dash");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("draw line");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("erase something");
        }
    }
}
