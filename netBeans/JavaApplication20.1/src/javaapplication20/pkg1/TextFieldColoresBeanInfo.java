/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20.pkg1;

import java.beans.*;

/**
 *
 * @author Tarde
 */
public class TextFieldColoresBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( javaapplication20.pkg1.TextFieldColores.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_action = 1;
    private static final int PROPERTY_actionCommand = 2;
    private static final int PROPERTY_actionListeners = 3;
    private static final int PROPERTY_actionMap = 4;
    private static final int PROPERTY_actions = 5;
    private static final int PROPERTY_alignmentX = 6;
    private static final int PROPERTY_alignmentY = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_autoscrolls = 9;
    private static final int PROPERTY_background = 10;
    private static final int PROPERTY_backgroundSet = 11;
    private static final int PROPERTY_baselineResizeBehavior = 12;
    private static final int PROPERTY_border = 13;
    private static final int PROPERTY_bounds = 14;
    private static final int PROPERTY_caret = 15;
    private static final int PROPERTY_caretColor = 16;
    private static final int PROPERTY_caretListeners = 17;
    private static final int PROPERTY_caretPosition = 18;
    private static final int PROPERTY_colorModel = 19;
    private static final int PROPERTY_columns = 20;
    private static final int PROPERTY_component = 21;
    private static final int PROPERTY_componentCount = 22;
    private static final int PROPERTY_componentListeners = 23;
    private static final int PROPERTY_componentOrientation = 24;
    private static final int PROPERTY_componentPopupMenu = 25;
    private static final int PROPERTY_components = 26;
    private static final int PROPERTY_containerListeners = 27;
    private static final int PROPERTY_cursor = 28;
    private static final int PROPERTY_cursorSet = 29;
    private static final int PROPERTY_debugGraphicsOptions = 30;
    private static final int PROPERTY_disabledTextColor = 31;
    private static final int PROPERTY_displayable = 32;
    private static final int PROPERTY_document = 33;
    private static final int PROPERTY_doubleBuffered = 34;
    private static final int PROPERTY_dragEnabled = 35;
    private static final int PROPERTY_dropLocation = 36;
    private static final int PROPERTY_dropMode = 37;
    private static final int PROPERTY_dropTarget = 38;
    private static final int PROPERTY_editable = 39;
    private static final int PROPERTY_enabled = 40;
    private static final int PROPERTY_focusable = 41;
    private static final int PROPERTY_focusAccelerator = 42;
    private static final int PROPERTY_focusCycleRoot = 43;
    private static final int PROPERTY_focusCycleRootAncestor = 44;
    private static final int PROPERTY_focusListeners = 45;
    private static final int PROPERTY_focusOwner = 46;
    private static final int PROPERTY_focusTraversable = 47;
    private static final int PROPERTY_focusTraversalKeys = 48;
    private static final int PROPERTY_focusTraversalKeysEnabled = 49;
    private static final int PROPERTY_focusTraversalPolicy = 50;
    private static final int PROPERTY_focusTraversalPolicyProvider = 51;
    private static final int PROPERTY_focusTraversalPolicySet = 52;
    private static final int PROPERTY_fondoytexto = 53;
    private static final int PROPERTY_font = 54;
    private static final int PROPERTY_fontSet = 55;
    private static final int PROPERTY_foreground = 56;
    private static final int PROPERTY_foregroundSet = 57;
    private static final int PROPERTY_graphics = 58;
    private static final int PROPERTY_graphicsConfiguration = 59;
    private static final int PROPERTY_height = 60;
    private static final int PROPERTY_hierarchyBoundsListeners = 61;
    private static final int PROPERTY_hierarchyListeners = 62;
    private static final int PROPERTY_highlighter = 63;
    private static final int PROPERTY_horizontalAlignment = 64;
    private static final int PROPERTY_horizontalVisibility = 65;
    private static final int PROPERTY_ignoreRepaint = 66;
    private static final int PROPERTY_inheritsPopupMenu = 67;
    private static final int PROPERTY_inputContext = 68;
    private static final int PROPERTY_inputMap = 69;
    private static final int PROPERTY_inputMethodListeners = 70;
    private static final int PROPERTY_inputMethodRequests = 71;
    private static final int PROPERTY_inputVerifier = 72;
    private static final int PROPERTY_insets = 73;
    private static final int PROPERTY_keyListeners = 74;
    private static final int PROPERTY_keymap = 75;
    private static final int PROPERTY_layout = 76;
    private static final int PROPERTY_lightweight = 77;
    private static final int PROPERTY_locale = 78;
    private static final int PROPERTY_location = 79;
    private static final int PROPERTY_locationOnScreen = 80;
    private static final int PROPERTY_managingFocus = 81;
    private static final int PROPERTY_margin = 82;
    private static final int PROPERTY_maximumSize = 83;
    private static final int PROPERTY_maximumSizeSet = 84;
    private static final int PROPERTY_minimumSize = 85;
    private static final int PROPERTY_minimumSizeSet = 86;
    private static final int PROPERTY_mouseListeners = 87;
    private static final int PROPERTY_mouseMotionListeners = 88;
    private static final int PROPERTY_mousePosition = 89;
    private static final int PROPERTY_mouseWheelListeners = 90;
    private static final int PROPERTY_name = 91;
    private static final int PROPERTY_navigationFilter = 92;
    private static final int PROPERTY_nextFocusableComponent = 93;
    private static final int PROPERTY_numCaracteres = 94;
    private static final int PROPERTY_opaque = 95;
    private static final int PROPERTY_optimizedDrawingEnabled = 96;
    private static final int PROPERTY_paintingForPrint = 97;
    private static final int PROPERTY_paintingTile = 98;
    private static final int PROPERTY_parent = 99;
    private static final int PROPERTY_peer = 100;
    private static final int PROPERTY_preferredScrollableViewportSize = 101;
    private static final int PROPERTY_preferredSize = 102;
    private static final int PROPERTY_preferredSizeSet = 103;
    private static final int PROPERTY_propertyChangeListeners = 104;
    private static final int PROPERTY_registeredKeyStrokes = 105;
    private static final int PROPERTY_requestFocusEnabled = 106;
    private static final int PROPERTY_rootPane = 107;
    private static final int PROPERTY_scrollableTracksViewportHeight = 108;
    private static final int PROPERTY_scrollableTracksViewportWidth = 109;
    private static final int PROPERTY_scrollOffset = 110;
    private static final int PROPERTY_selectedText = 111;
    private static final int PROPERTY_selectedTextColor = 112;
    private static final int PROPERTY_selectionColor = 113;
    private static final int PROPERTY_selectionEnd = 114;
    private static final int PROPERTY_selectionStart = 115;
    private static final int PROPERTY_showing = 116;
    private static final int PROPERTY_size = 117;
    private static final int PROPERTY_text = 118;
    private static final int PROPERTY_toolkit = 119;
    private static final int PROPERTY_toolTipText = 120;
    private static final int PROPERTY_topLevelAncestor = 121;
    private static final int PROPERTY_transferHandler = 122;
    private static final int PROPERTY_treeLock = 123;
    private static final int PROPERTY_UI = 124;
    private static final int PROPERTY_UIClassID = 125;
    private static final int PROPERTY_valid = 126;
    private static final int PROPERTY_validateRoot = 127;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 128;
    private static final int PROPERTY_vetoableChangeListeners = 129;
    private static final int PROPERTY_visible = 130;
    private static final int PROPERTY_visibleRect = 131;
    private static final int PROPERTY_width = 132;
    private static final int PROPERTY_x = 133;
    private static final int PROPERTY_y = 134;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[135];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", javaapplication20.pkg1.TextFieldColores.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", javaapplication20.pkg1.TextFieldColores.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", javaapplication20.pkg1.TextFieldColores.class, null, "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", javaapplication20.pkg1.TextFieldColores.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", javaapplication20.pkg1.TextFieldColores.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actions] = new PropertyDescriptor ( "actions", javaapplication20.pkg1.TextFieldColores.class, "getActions", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", javaapplication20.pkg1.TextFieldColores.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", javaapplication20.pkg1.TextFieldColores.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", javaapplication20.pkg1.TextFieldColores.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", javaapplication20.pkg1.TextFieldColores.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", javaapplication20.pkg1.TextFieldColores.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", javaapplication20.pkg1.TextFieldColores.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", javaapplication20.pkg1.TextFieldColores.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", javaapplication20.pkg1.TextFieldColores.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", javaapplication20.pkg1.TextFieldColores.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_caret] = new PropertyDescriptor ( "caret", javaapplication20.pkg1.TextFieldColores.class, "getCaret", "setCaret" ); // NOI18N
            properties[PROPERTY_caretColor] = new PropertyDescriptor ( "caretColor", javaapplication20.pkg1.TextFieldColores.class, "getCaretColor", "setCaretColor" ); // NOI18N
            properties[PROPERTY_caretListeners] = new PropertyDescriptor ( "caretListeners", javaapplication20.pkg1.TextFieldColores.class, "getCaretListeners", null ); // NOI18N
            properties[PROPERTY_caretPosition] = new PropertyDescriptor ( "caretPosition", javaapplication20.pkg1.TextFieldColores.class, "getCaretPosition", "setCaretPosition" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", javaapplication20.pkg1.TextFieldColores.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_columns] = new PropertyDescriptor ( "columns", javaapplication20.pkg1.TextFieldColores.class, "getColumns", "setColumns" ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", javaapplication20.pkg1.TextFieldColores.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", javaapplication20.pkg1.TextFieldColores.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", javaapplication20.pkg1.TextFieldColores.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", javaapplication20.pkg1.TextFieldColores.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", javaapplication20.pkg1.TextFieldColores.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", javaapplication20.pkg1.TextFieldColores.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", javaapplication20.pkg1.TextFieldColores.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", javaapplication20.pkg1.TextFieldColores.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", javaapplication20.pkg1.TextFieldColores.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", javaapplication20.pkg1.TextFieldColores.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_disabledTextColor] = new PropertyDescriptor ( "disabledTextColor", javaapplication20.pkg1.TextFieldColores.class, "getDisabledTextColor", "setDisabledTextColor" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", javaapplication20.pkg1.TextFieldColores.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_document] = new PropertyDescriptor ( "document", javaapplication20.pkg1.TextFieldColores.class, "getDocument", "setDocument" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", javaapplication20.pkg1.TextFieldColores.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", javaapplication20.pkg1.TextFieldColores.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", javaapplication20.pkg1.TextFieldColores.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", javaapplication20.pkg1.TextFieldColores.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", javaapplication20.pkg1.TextFieldColores.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", javaapplication20.pkg1.TextFieldColores.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", javaapplication20.pkg1.TextFieldColores.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", javaapplication20.pkg1.TextFieldColores.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusAccelerator] = new PropertyDescriptor ( "focusAccelerator", javaapplication20.pkg1.TextFieldColores.class, "getFocusAccelerator", "setFocusAccelerator" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", javaapplication20.pkg1.TextFieldColores.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", javaapplication20.pkg1.TextFieldColores.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", javaapplication20.pkg1.TextFieldColores.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", javaapplication20.pkg1.TextFieldColores.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", javaapplication20.pkg1.TextFieldColores.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", javaapplication20.pkg1.TextFieldColores.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", javaapplication20.pkg1.TextFieldColores.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", javaapplication20.pkg1.TextFieldColores.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", javaapplication20.pkg1.TextFieldColores.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", javaapplication20.pkg1.TextFieldColores.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_fondoytexto] = new PropertyDescriptor ( "fondoytexto", javaapplication20.pkg1.TextFieldColores.class, "getFondoytexto", "setFondoytexto" ); // NOI18N
            properties[PROPERTY_fondoytexto].setPropertyEditorClass ( javaapplication20.pkg1.ColoresPropertyEditor.class );
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", javaapplication20.pkg1.TextFieldColores.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", javaapplication20.pkg1.TextFieldColores.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", javaapplication20.pkg1.TextFieldColores.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", javaapplication20.pkg1.TextFieldColores.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", javaapplication20.pkg1.TextFieldColores.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", javaapplication20.pkg1.TextFieldColores.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", javaapplication20.pkg1.TextFieldColores.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", javaapplication20.pkg1.TextFieldColores.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", javaapplication20.pkg1.TextFieldColores.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_highlighter] = new PropertyDescriptor ( "highlighter", javaapplication20.pkg1.TextFieldColores.class, "getHighlighter", "setHighlighter" ); // NOI18N
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", javaapplication20.pkg1.TextFieldColores.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalVisibility] = new PropertyDescriptor ( "horizontalVisibility", javaapplication20.pkg1.TextFieldColores.class, "getHorizontalVisibility", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", javaapplication20.pkg1.TextFieldColores.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", javaapplication20.pkg1.TextFieldColores.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", javaapplication20.pkg1.TextFieldColores.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", javaapplication20.pkg1.TextFieldColores.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", javaapplication20.pkg1.TextFieldColores.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", javaapplication20.pkg1.TextFieldColores.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", javaapplication20.pkg1.TextFieldColores.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", javaapplication20.pkg1.TextFieldColores.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", javaapplication20.pkg1.TextFieldColores.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_keymap] = new PropertyDescriptor ( "keymap", javaapplication20.pkg1.TextFieldColores.class, "getKeymap", "setKeymap" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", javaapplication20.pkg1.TextFieldColores.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", javaapplication20.pkg1.TextFieldColores.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", javaapplication20.pkg1.TextFieldColores.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", javaapplication20.pkg1.TextFieldColores.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", javaapplication20.pkg1.TextFieldColores.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", javaapplication20.pkg1.TextFieldColores.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", javaapplication20.pkg1.TextFieldColores.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", javaapplication20.pkg1.TextFieldColores.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", javaapplication20.pkg1.TextFieldColores.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", javaapplication20.pkg1.TextFieldColores.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", javaapplication20.pkg1.TextFieldColores.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", javaapplication20.pkg1.TextFieldColores.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", javaapplication20.pkg1.TextFieldColores.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", javaapplication20.pkg1.TextFieldColores.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", javaapplication20.pkg1.TextFieldColores.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", javaapplication20.pkg1.TextFieldColores.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_navigationFilter] = new PropertyDescriptor ( "navigationFilter", javaapplication20.pkg1.TextFieldColores.class, "getNavigationFilter", "setNavigationFilter" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", javaapplication20.pkg1.TextFieldColores.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_numCaracteres] = new PropertyDescriptor ( "numCaracteres", javaapplication20.pkg1.TextFieldColores.class, "getNumCaracteres", "setNumCaracteres" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", javaapplication20.pkg1.TextFieldColores.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", javaapplication20.pkg1.TextFieldColores.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", javaapplication20.pkg1.TextFieldColores.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", javaapplication20.pkg1.TextFieldColores.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", javaapplication20.pkg1.TextFieldColores.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", javaapplication20.pkg1.TextFieldColores.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", javaapplication20.pkg1.TextFieldColores.class, "getPreferredScrollableViewportSize", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", javaapplication20.pkg1.TextFieldColores.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", javaapplication20.pkg1.TextFieldColores.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", javaapplication20.pkg1.TextFieldColores.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", javaapplication20.pkg1.TextFieldColores.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", javaapplication20.pkg1.TextFieldColores.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", javaapplication20.pkg1.TextFieldColores.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", javaapplication20.pkg1.TextFieldColores.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", javaapplication20.pkg1.TextFieldColores.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_scrollOffset] = new PropertyDescriptor ( "scrollOffset", javaapplication20.pkg1.TextFieldColores.class, "getScrollOffset", "setScrollOffset" ); // NOI18N
            properties[PROPERTY_selectedText] = new PropertyDescriptor ( "selectedText", javaapplication20.pkg1.TextFieldColores.class, "getSelectedText", null ); // NOI18N
            properties[PROPERTY_selectedTextColor] = new PropertyDescriptor ( "selectedTextColor", javaapplication20.pkg1.TextFieldColores.class, "getSelectedTextColor", "setSelectedTextColor" ); // NOI18N
            properties[PROPERTY_selectionColor] = new PropertyDescriptor ( "selectionColor", javaapplication20.pkg1.TextFieldColores.class, "getSelectionColor", "setSelectionColor" ); // NOI18N
            properties[PROPERTY_selectionEnd] = new PropertyDescriptor ( "selectionEnd", javaapplication20.pkg1.TextFieldColores.class, "getSelectionEnd", "setSelectionEnd" ); // NOI18N
            properties[PROPERTY_selectionStart] = new PropertyDescriptor ( "selectionStart", javaapplication20.pkg1.TextFieldColores.class, "getSelectionStart", "setSelectionStart" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", javaapplication20.pkg1.TextFieldColores.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", javaapplication20.pkg1.TextFieldColores.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", javaapplication20.pkg1.TextFieldColores.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", javaapplication20.pkg1.TextFieldColores.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", javaapplication20.pkg1.TextFieldColores.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", javaapplication20.pkg1.TextFieldColores.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", javaapplication20.pkg1.TextFieldColores.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", javaapplication20.pkg1.TextFieldColores.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", javaapplication20.pkg1.TextFieldColores.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", javaapplication20.pkg1.TextFieldColores.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", javaapplication20.pkg1.TextFieldColores.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", javaapplication20.pkg1.TextFieldColores.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", javaapplication20.pkg1.TextFieldColores.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", javaapplication20.pkg1.TextFieldColores.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", javaapplication20.pkg1.TextFieldColores.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", javaapplication20.pkg1.TextFieldColores.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", javaapplication20.pkg1.TextFieldColores.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", javaapplication20.pkg1.TextFieldColores.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", javaapplication20.pkg1.TextFieldColores.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_caretListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_keyListener = 9;
    private static final int EVENT_mouseListener = 10;
    private static final int EVENT_mouseMotionListener = 11;
    private static final int EVENT_mouseWheelListener = 12;
    private static final int EVENT_propertyChangeListener = 13;
    private static final int EVENT_vetoableChangeListener = 14;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[15];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_caretListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "caretListener", javax.swing.event.CaretListener.class, new String[] {"caretUpdate"}, "addCaretListener", "removeCaretListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( javaapplication20.pkg1.TextFieldColores.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_actualizarColores1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_addKeymap8 = 8;
    private static final int METHOD_addNotify9 = 9;
    private static final int METHOD_addPropertyChangeListener10 = 10;
    private static final int METHOD_applyComponentOrientation11 = 11;
    private static final int METHOD_areFocusTraversalKeysSet12 = 12;
    private static final int METHOD_bounds13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_checkImage15 = 15;
    private static final int METHOD_computeVisibleRect16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_contains18 = 18;
    private static final int METHOD_copy19 = 19;
    private static final int METHOD_countComponents20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createToolTip23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_createVolatileImage25 = 25;
    private static final int METHOD_cut26 = 26;
    private static final int METHOD_deliverEvent27 = 27;
    private static final int METHOD_disable28 = 28;
    private static final int METHOD_dispatchEvent29 = 29;
    private static final int METHOD_doLayout30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enableInputMethods33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_findComponentAt35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_getActionForKeyStroke44 = 44;
    private static final int METHOD_getBaseline45 = 45;
    private static final int METHOD_getBounds46 = 46;
    private static final int METHOD_getClientProperty47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentAt49 = 49;
    private static final int METHOD_getComponentZOrder50 = 50;
    private static final int METHOD_getConditionForKeyStroke51 = 51;
    private static final int METHOD_getDefaultLocale52 = 52;
    private static final int METHOD_getFocusTraversalKeys53 = 53;
    private static final int METHOD_getFontMetrics54 = 54;
    private static final int METHOD_getInsets55 = 55;
    private static final int METHOD_getKeymap56 = 56;
    private static final int METHOD_getListeners57 = 57;
    private static final int METHOD_getLocation58 = 58;
    private static final int METHOD_getMousePosition59 = 59;
    private static final int METHOD_getPopupLocation60 = 60;
    private static final int METHOD_getPrintable61 = 61;
    private static final int METHOD_getPropertyChangeListeners62 = 62;
    private static final int METHOD_getScrollableBlockIncrement63 = 63;
    private static final int METHOD_getScrollableUnitIncrement64 = 64;
    private static final int METHOD_getSize65 = 65;
    private static final int METHOD_getText66 = 66;
    private static final int METHOD_getToolTipLocation67 = 67;
    private static final int METHOD_getToolTipText68 = 68;
    private static final int METHOD_gotFocus69 = 69;
    private static final int METHOD_grabFocus70 = 70;
    private static final int METHOD_handleEvent71 = 71;
    private static final int METHOD_hasFocus72 = 72;
    private static final int METHOD_hide73 = 73;
    private static final int METHOD_imageUpdate74 = 74;
    private static final int METHOD_insets75 = 75;
    private static final int METHOD_inside76 = 76;
    private static final int METHOD_invalidate77 = 77;
    private static final int METHOD_isAncestorOf78 = 78;
    private static final int METHOD_isFocusCycleRoot79 = 79;
    private static final int METHOD_isLightweightComponent80 = 80;
    private static final int METHOD_keyDown81 = 81;
    private static final int METHOD_keyUp82 = 82;
    private static final int METHOD_layout83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_list87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_loadKeymap89 = 89;
    private static final int METHOD_locate90 = 90;
    private static final int METHOD_location91 = 91;
    private static final int METHOD_lostFocus92 = 92;
    private static final int METHOD_minimumSize93 = 93;
    private static final int METHOD_modelToView94 = 94;
    private static final int METHOD_mouseDown95 = 95;
    private static final int METHOD_mouseDrag96 = 96;
    private static final int METHOD_mouseEnter97 = 97;
    private static final int METHOD_mouseExit98 = 98;
    private static final int METHOD_mouseMove99 = 99;
    private static final int METHOD_mouseUp100 = 100;
    private static final int METHOD_move101 = 101;
    private static final int METHOD_moveCaretPosition102 = 102;
    private static final int METHOD_nextFocus103 = 103;
    private static final int METHOD_paint104 = 104;
    private static final int METHOD_paintAll105 = 105;
    private static final int METHOD_paintComponents106 = 106;
    private static final int METHOD_paintImmediately107 = 107;
    private static final int METHOD_paintImmediately108 = 108;
    private static final int METHOD_paste109 = 109;
    private static final int METHOD_postActionEvent110 = 110;
    private static final int METHOD_postEvent111 = 111;
    private static final int METHOD_preferredSize112 = 112;
    private static final int METHOD_prepareImage113 = 113;
    private static final int METHOD_prepareImage114 = 114;
    private static final int METHOD_print115 = 115;
    private static final int METHOD_print116 = 116;
    private static final int METHOD_print117 = 117;
    private static final int METHOD_print118 = 118;
    private static final int METHOD_printAll119 = 119;
    private static final int METHOD_printComponents120 = 120;
    private static final int METHOD_putClientProperty121 = 121;
    private static final int METHOD_read122 = 122;
    private static final int METHOD_registerKeyboardAction123 = 123;
    private static final int METHOD_registerKeyboardAction124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_remove126 = 126;
    private static final int METHOD_remove127 = 127;
    private static final int METHOD_removeAll128 = 128;
    private static final int METHOD_removeKeymap129 = 129;
    private static final int METHOD_removeNotify130 = 130;
    private static final int METHOD_removePropertyChangeListener131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_repaint134 = 134;
    private static final int METHOD_repaint135 = 135;
    private static final int METHOD_repaint136 = 136;
    private static final int METHOD_replaceSelection137 = 137;
    private static final int METHOD_requestDefaultFocus138 = 138;
    private static final int METHOD_requestFocus139 = 139;
    private static final int METHOD_requestFocus140 = 140;
    private static final int METHOD_requestFocusInWindow141 = 141;
    private static final int METHOD_resetKeyboardActions142 = 142;
    private static final int METHOD_reshape143 = 143;
    private static final int METHOD_resize144 = 144;
    private static final int METHOD_resize145 = 145;
    private static final int METHOD_revalidate146 = 146;
    private static final int METHOD_scrollRectToVisible147 = 147;
    private static final int METHOD_select148 = 148;
    private static final int METHOD_selectAll149 = 149;
    private static final int METHOD_setBounds150 = 150;
    private static final int METHOD_setComponentZOrder151 = 151;
    private static final int METHOD_setDefaultLocale152 = 152;
    private static final int METHOD_show153 = 153;
    private static final int METHOD_show154 = 154;
    private static final int METHOD_size155 = 155;
    private static final int METHOD_toString156 = 156;
    private static final int METHOD_transferFocus157 = 157;
    private static final int METHOD_transferFocusBackward158 = 158;
    private static final int METHOD_transferFocusDownCycle159 = 159;
    private static final int METHOD_transferFocusUpCycle160 = 160;
    private static final int METHOD_unregisterKeyboardAction161 = 161;
    private static final int METHOD_update162 = 162;
    private static final int METHOD_updateUI163 = 163;
    private static final int METHOD_validate164 = 164;
    private static final int METHOD_viewToModel165 = 165;
    private static final int METHOD_write166 = 166;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[167];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_actualizarColores1] = new MethodDescriptor(javaapplication20.pkg1.TextFieldColores.class.getMethod("actualizarColores", new Class[] {})); // NOI18N
            methods[METHOD_actualizarColores1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_addKeymap8] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("addKeymap", new Class[] {java.lang.String.class, javax.swing.text.Keymap.class})); // NOI18N
            methods[METHOD_addKeymap8].setDisplayName ( "" );
            methods[METHOD_addNotify9] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify9].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener10] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener10].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation11] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation11].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet12] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet12].setDisplayName ( "" );
            methods[METHOD_bounds13] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_checkImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage15].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect16] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_contains18] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains18].setDisplayName ( "" );
            methods[METHOD_copy19] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("copy", new Class[] {})); // NOI18N
            methods[METHOD_copy19].setDisplayName ( "" );
            methods[METHOD_countComponents20] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage22].setDisplayName ( "" );
            methods[METHOD_createToolTip23] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_createVolatileImage25] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage25].setDisplayName ( "" );
            methods[METHOD_cut26] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("cut", new Class[] {})); // NOI18N
            methods[METHOD_cut26].setDisplayName ( "" );
            methods[METHOD_deliverEvent27] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent27].setDisplayName ( "" );
            methods[METHOD_disable28] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable28].setDisplayName ( "" );
            methods[METHOD_dispatchEvent29] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent29].setDisplayName ( "" );
            methods[METHOD_doLayout30] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enable32] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable32].setDisplayName ( "" );
            methods[METHOD_enableInputMethods33] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_findComponentAt35] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke44].setDisplayName ( "" );
            methods[METHOD_getBaseline45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline45].setDisplayName ( "" );
            methods[METHOD_getBounds46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds46].setDisplayName ( "" );
            methods[METHOD_getClientProperty47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentAt49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt49].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder50] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder50].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke51].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale52].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys53] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys53].setDisplayName ( "" );
            methods[METHOD_getFontMetrics54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics54].setDisplayName ( "" );
            methods[METHOD_getInsets55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets55].setDisplayName ( "" );
            methods[METHOD_getKeymap56] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getKeymap56].setDisplayName ( "" );
            methods[METHOD_getListeners57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners57].setDisplayName ( "" );
            methods[METHOD_getLocation58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation58].setDisplayName ( "" );
            methods[METHOD_getMousePosition59] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition59].setDisplayName ( "" );
            methods[METHOD_getPopupLocation60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation60].setDisplayName ( "" );
            methods[METHOD_getPrintable61] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getPrintable", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable61].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners62] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners62].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement63] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement63].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement64] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement64].setDisplayName ( "" );
            methods[METHOD_getSize65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize65].setDisplayName ( "" );
            methods[METHOD_getText66] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getText", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getText66].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation67].setDisplayName ( "" );
            methods[METHOD_getToolTipText68] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText68].setDisplayName ( "" );
            methods[METHOD_gotFocus69] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus69].setDisplayName ( "" );
            methods[METHOD_grabFocus70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus70].setDisplayName ( "" );
            methods[METHOD_handleEvent71] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent71].setDisplayName ( "" );
            methods[METHOD_hasFocus72] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus72].setDisplayName ( "" );
            methods[METHOD_hide73] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide73].setDisplayName ( "" );
            methods[METHOD_imageUpdate74] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate74].setDisplayName ( "" );
            methods[METHOD_insets75] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets75].setDisplayName ( "" );
            methods[METHOD_inside76] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside76].setDisplayName ( "" );
            methods[METHOD_invalidate77] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate77].setDisplayName ( "" );
            methods[METHOD_isAncestorOf78] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf78].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot79] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot79].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent80] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent80].setDisplayName ( "" );
            methods[METHOD_keyDown81] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown81].setDisplayName ( "" );
            methods[METHOD_keyUp82] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp82].setDisplayName ( "" );
            methods[METHOD_layout83] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_list87] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_loadKeymap89] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("loadKeymap", new Class[] {javax.swing.text.Keymap.class, javax.swing.text.JTextComponent.KeyBinding[].class, javax.swing.Action[].class})); // NOI18N
            methods[METHOD_loadKeymap89].setDisplayName ( "" );
            methods[METHOD_locate90] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate90].setDisplayName ( "" );
            methods[METHOD_location91] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location91].setDisplayName ( "" );
            methods[METHOD_lostFocus92] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus92].setDisplayName ( "" );
            methods[METHOD_minimumSize93] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize93].setDisplayName ( "" );
            methods[METHOD_modelToView94] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("modelToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_modelToView94].setDisplayName ( "" );
            methods[METHOD_mouseDown95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown95].setDisplayName ( "" );
            methods[METHOD_mouseDrag96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag96].setDisplayName ( "" );
            methods[METHOD_mouseEnter97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter97].setDisplayName ( "" );
            methods[METHOD_mouseExit98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit98].setDisplayName ( "" );
            methods[METHOD_mouseMove99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove99].setDisplayName ( "" );
            methods[METHOD_mouseUp100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp100].setDisplayName ( "" );
            methods[METHOD_move101] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move101].setDisplayName ( "" );
            methods[METHOD_moveCaretPosition102] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("moveCaretPosition", new Class[] {int.class})); // NOI18N
            methods[METHOD_moveCaretPosition102].setDisplayName ( "" );
            methods[METHOD_nextFocus103] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus103].setDisplayName ( "" );
            methods[METHOD_paint104] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint104].setDisplayName ( "" );
            methods[METHOD_paintAll105] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll105].setDisplayName ( "" );
            methods[METHOD_paintComponents106] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents106].setDisplayName ( "" );
            methods[METHOD_paintImmediately107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately107].setDisplayName ( "" );
            methods[METHOD_paintImmediately108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately108].setDisplayName ( "" );
            methods[METHOD_paste109] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("paste", new Class[] {})); // NOI18N
            methods[METHOD_paste109].setDisplayName ( "" );
            methods[METHOD_postActionEvent110] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("postActionEvent", new Class[] {})); // NOI18N
            methods[METHOD_postActionEvent110].setDisplayName ( "" );
            methods[METHOD_postEvent111] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent111].setDisplayName ( "" );
            methods[METHOD_preferredSize112] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize112].setDisplayName ( "" );
            methods[METHOD_prepareImage113] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage113].setDisplayName ( "" );
            methods[METHOD_prepareImage114] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage114].setDisplayName ( "" );
            methods[METHOD_print115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print115].setDisplayName ( "" );
            methods[METHOD_print116] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print116].setDisplayName ( "" );
            methods[METHOD_print117] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print117].setDisplayName ( "" );
            methods[METHOD_print118] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.PrintService.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print118].setDisplayName ( "" );
            methods[METHOD_printAll119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll119].setDisplayName ( "" );
            methods[METHOD_printComponents120] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents120].setDisplayName ( "" );
            methods[METHOD_putClientProperty121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty121].setDisplayName ( "" );
            methods[METHOD_read122] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("read", new Class[] {java.io.Reader.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_read122].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction123].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_remove126] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove126].setDisplayName ( "" );
            methods[METHOD_remove127] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove127].setDisplayName ( "" );
            methods[METHOD_removeAll128] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll128].setDisplayName ( "" );
            methods[METHOD_removeKeymap129] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_removeKeymap129].setDisplayName ( "" );
            methods[METHOD_removeNotify130] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify130].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener131] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_repaint134] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint134].setDisplayName ( "" );
            methods[METHOD_repaint135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint135].setDisplayName ( "" );
            methods[METHOD_repaint136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint136].setDisplayName ( "" );
            methods[METHOD_replaceSelection137] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("replaceSelection", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_replaceSelection137].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus138].setDisplayName ( "" );
            methods[METHOD_requestFocus139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus139].setDisplayName ( "" );
            methods[METHOD_requestFocus140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus140].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow141].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions142].setDisplayName ( "" );
            methods[METHOD_reshape143] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape143].setDisplayName ( "" );
            methods[METHOD_resize144] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize144].setDisplayName ( "" );
            methods[METHOD_resize145] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize145].setDisplayName ( "" );
            methods[METHOD_revalidate146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate146].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible147] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible147].setDisplayName ( "" );
            methods[METHOD_select148] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("select", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_select148].setDisplayName ( "" );
            methods[METHOD_selectAll149] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll149].setDisplayName ( "" );
            methods[METHOD_setBounds150] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds150].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder151] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder151].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale152] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale152].setDisplayName ( "" );
            methods[METHOD_show153] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show153].setDisplayName ( "" );
            methods[METHOD_show154] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show154].setDisplayName ( "" );
            methods[METHOD_size155] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size155].setDisplayName ( "" );
            methods[METHOD_toString156] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString156].setDisplayName ( "" );
            methods[METHOD_transferFocus157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus157].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward158] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward158].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle159] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle159].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle160] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle160].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction161] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction161].setDisplayName ( "" );
            methods[METHOD_update162] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update162].setDisplayName ( "" );
            methods[METHOD_updateUI163] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI163].setDisplayName ( "" );
            methods[METHOD_validate164] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate164].setDisplayName ( "" );
            methods[METHOD_viewToModel165] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("viewToModel", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_viewToModel165].setDisplayName ( "" );
            methods[METHOD_write166] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("write", new Class[] {java.io.Writer.class})); // NOI18N
            methods[METHOD_write166].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
