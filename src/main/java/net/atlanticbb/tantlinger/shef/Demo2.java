package net.atlanticbb.tantlinger.shef;

import net.atlanticbb.tantlinger.io.IOUtils;
import net.atlanticbb.tantlinger.ui.text.AbstractToolBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 22.07.2017.
 */
public class Demo2 {

    public Demo2() {


        final HTMLEditorPane editor = new HTMLEditorPane();

        InputStream in = Demo.class.getResourceAsStream("/net/atlanticbb/tantlinger/shef/htmlsnip.txt");
        try{
            editor.setText(IOUtils.read(in));
        }catch(IOException ex) {
            ex.printStackTrace();
        } finally {
            IOUtils.close(in);
        }

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();

        final JButton returnButton = new JButton("<<Вернуться в основное меню");
        returnButton.setVisible(false);

        final JButton first = new JButton("Задание №1");


        final MyJCheckBox paragraphCombo = new MyJCheckBox("Стили", "paragraphCombo");
        paragraphCombo.setSelected(true);
        paragraphCombo.setVisible(false);

        final MyJCheckBox fontFamilyCombo = new MyJCheckBox("Шрифты", "fontFamilyCombo");
        fontFamilyCombo.setSelected(true);
        fontFamilyCombo.setVisible(false);

        final MyJCheckBox fontSizeButton = new MyJCheckBox("Размер шрифта", "fontSizeButton");
        fontSizeButton.setSelected(true);
        fontSizeButton.setVisible(false);

        final MyJCheckBox fontColor = new MyJCheckBox("Цвет текста", "0");
        fontColor.setSelected(true);
        fontColor.setVisible(false);

        final MyJCheckBox fontBold = new MyJCheckBox("Выделить жирным", "1");
        fontBold.setSelected(true);
        fontBold.setVisible(false);

        final MyJCheckBox fontCursive = new MyJCheckBox("Выделить курсивом", "2");
        fontCursive.setSelected(true);
        fontCursive.setVisible(false);

        final MyJCheckBox fontUnderline = new MyJCheckBox("Подчеркнуть", "3");
        fontUnderline.setSelected(true);
        fontUnderline.setVisible(false);

        final MyJCheckBox unorderedList = new MyJCheckBox("Маркеры", "4");
        unorderedList.setSelected(true);
        unorderedList.setVisible(false);

        final MyJCheckBox orderedList = new MyJCheckBox("Нумерация", "5");
        orderedList.setSelected(true);
        orderedList.setVisible(false);

        final MyJCheckBox alignLeft = new MyJCheckBox("По левому краю", "6");
        alignLeft.setSelected(true);
        alignLeft.setVisible(false);

        final MyJCheckBox alignCenter = new MyJCheckBox("По центру", "7");
        alignCenter.setSelected(true);
        alignCenter.setVisible(false);

        final MyJCheckBox alignRight = new MyJCheckBox("По правому краю", "8");
        alignRight.setSelected(true);
        alignRight.setVisible(false);

        final MyJCheckBox alignWidth = new MyJCheckBox("По ширине", "9");
        alignWidth.setSelected(true);
        alignWidth.setVisible(false);

        final MyJCheckBox hyperlink = new MyJCheckBox("Гиперссылка", "10");
        hyperlink.setSelected(true);
        hyperlink.setVisible(false);

        final MyJCheckBox image = new MyJCheckBox("Изображение", "11");
        image.setSelected(true);
        image.setVisible(false);

        final MyJCheckBox table = new MyJCheckBox("Таблица", "12");
        table.setSelected(true);
        table.setVisible(false);

        final JButton second = new JButton("Задание №2");

        final JLabel labelWysEditor = new JLabel("Визуальный редактор");
        labelWysEditor.setVisible(false);
        final JLabel labelSourceEditor = new JLabel("Html редактор");
        labelSourceEditor.setVisible(false);
        final JRadioButton wysEditorShow = new JRadioButton("Показать");
        wysEditorShow.setVisible(false);
        final JRadioButton wysEditorHide = new JRadioButton("Скрыть");
        wysEditorHide.setVisible(false);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(wysEditorShow);
        buttonGroup1.add(wysEditorHide);

        final JRadioButton sourceEditorShow = new JRadioButton("Показать");
        sourceEditorShow.setVisible(false);
        final JRadioButton sourceEditorHide = new JRadioButton("Скрыть");
        sourceEditorHide.setVisible(false);
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(sourceEditorShow);
        buttonGroup2.add(sourceEditorHide);


        final JButton third = new JButton("Задание №3");
        final JLabel labelEditorName= new JLabel("Введите имя визуального редактора");
        labelEditorName.setVisible(false);
        final JTextField appointNameVisualEditor = new JTextField();
        appointNameVisualEditor.setMaximumSize(new Dimension(15000, 500));
        appointNameVisualEditor.setVisible(false);
        final JButton acceptVisualEditorName = new JButton("Ok");
        acceptVisualEditorName.setVisible(false);
        final JButton fourth = new JButton("Задание №4");
        final JTextField appointNameSourceEditor = new JTextField();
        appointNameSourceEditor.setMaximumSize(new Dimension(15000, 500));
        appointNameSourceEditor.setVisible(false);
        final JButton acceptSourceEditorName = new JButton("Ok");
        acceptSourceEditorName.setVisible(false);
        final JButton fifth = new JButton("Задание №5");
        final JLabel labelDefaultFont = new JLabel("Выделите текст и нажмите Изменить");
        final JButton changeOnDefaultFont = new JButton("Изменить");
        labelDefaultFont.setVisible(false);
        changeOnDefaultFont.setVisible(false);
        final JButton sixth = new JButton("Задание №6");
        final JLabel labelInsertText = new JLabel("Введите текст и нажмите Вставить");
        final JTextField inputText = new JTextField();
        inputText.setVisible(false);
        inputText.setMaximumSize(new Dimension(15000, 500));
        final JButton insertButton = new JButton("Вставить");
        labelInsertText.setVisible(false);
        insertButton.setVisible(false);

        ActionListener actionHide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();

                if (e.getSource() == first) {
                    returnButton.setVisible(true);
                    paragraphCombo.setVisible(true);
                    fontFamilyCombo.setVisible(true);
                    fontSizeButton.setVisible(true);
                    fontColor.setVisible(true);
                    fontBold.setVisible(true);
                    fontCursive.setVisible(true);
                    fontUnderline.setVisible(true);
                    unorderedList.setVisible(true);
                    orderedList.setVisible(true);
                    alignLeft.setVisible(true);
                    alignCenter.setVisible(true);
                    alignRight.setVisible(true);
                    alignWidth.setVisible(true);
                    hyperlink.setVisible(true);
                    image.setVisible(true);
                    table.setVisible(true);
                    first.setVisible(false);
                    second.setVisible(false);
                    third.setVisible(false);
                    fourth.setVisible(false);
                    fifth.setVisible(false);
                    sixth.setVisible(false);
                    wysEditorShow.setVisible(false);
                    wysEditorHide.setVisible(false);
                    sourceEditorShow.setVisible(false);
                    sourceEditorHide.setVisible(false);
                    acceptVisualEditorName.setVisible(false);
                }
            }
        };
        first.addActionListener(actionHide);
        returnButton.addActionListener(actionHide);
        ItemListener actionHideOfElementToolBar = new ItemListener() {

            public void itemStateChanged(ItemEvent e) {

                Object source = e.getItemSelectable();

                if (e.getStateChange() == ItemEvent.DESELECTED){
                    AbstractToolBar.setButtonVisible(((MyJCheckBox) e.getSource()).getDescription(), false);
                }else {
                    AbstractToolBar.setButtonVisible(((MyJCheckBox) e.getSource()).getDescription(), true);
                }
            }
        };
        paragraphCombo.addItemListener(actionHideOfElementToolBar);
        fontFamilyCombo.addItemListener(actionHideOfElementToolBar);
        fontSizeButton.addItemListener(actionHideOfElementToolBar);
        fontColor.addItemListener(actionHideOfElementToolBar);
        fontBold.addItemListener(actionHideOfElementToolBar);
        fontCursive.addItemListener(actionHideOfElementToolBar);
        fontUnderline.addItemListener(actionHideOfElementToolBar);
        unorderedList.addItemListener(actionHideOfElementToolBar);
        orderedList.addItemListener(actionHideOfElementToolBar);
        alignCenter.addItemListener(actionHideOfElementToolBar);
        alignLeft.addItemListener(actionHideOfElementToolBar);
        alignWidth.addItemListener(actionHideOfElementToolBar);
        alignRight.addItemListener(actionHideOfElementToolBar);
        hyperlink.addItemListener(actionHideOfElementToolBar);
        image.addItemListener(actionHideOfElementToolBar);
        table.addItemListener(actionHideOfElementToolBar);

        ActionListener actionReturn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == returnButton) {
                    returnButton.setVisible(false);
                    paragraphCombo.setVisible(false);
                    fontFamilyCombo.setVisible(false);
                    fontSizeButton.setVisible(false);
                    fontColor.setVisible(false);
                    fontBold.setVisible(false);
                    fontCursive.setVisible(false);
                    fontUnderline.setVisible(false);
                    unorderedList.setVisible(false);
                    orderedList.setVisible(false);
                    alignLeft.setVisible(false);
                    alignCenter.setVisible(false);
                    alignRight.setVisible(false);
                    alignWidth.setVisible(false);
                    hyperlink.setVisible(false);
                    image.setVisible(false);
                    table.setVisible(false);
                    first.setVisible(true);
                    second.setVisible(true);
                    third.setVisible(true);
                    fourth.setVisible(true);
                    fifth.setVisible(true);
                    sixth.setVisible(true);
                    labelWysEditor.setVisible(false);
                    labelSourceEditor.setVisible(false);
                    wysEditorShow.setVisible(false);
                    wysEditorHide.setVisible(false);
                    sourceEditorShow.setVisible(false);
                    sourceEditorHide.setVisible(false);
                    labelEditorName.setVisible(false);
                    appointNameVisualEditor.setVisible(false);
                    appointNameSourceEditor.setVisible(false);
                    acceptVisualEditorName.setVisible(false);
                    acceptSourceEditorName.setVisible(false);
                    labelDefaultFont.setVisible(false);
                    changeOnDefaultFont.setVisible(false);
                    labelInsertText.setVisible(false);
                    inputText.setVisible(false);
                    insertButton.setVisible(false);
                }
            }
        };

        returnButton.addActionListener(actionReturn);

        ActionListener actionListenerSecondTask = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnButton.setVisible(true);
                first.setVisible(false);
                second.setVisible(false);
                third.setVisible(false);
                fourth.setVisible(false);
                fifth.setVisible(false);
                sixth.setVisible(false);
                labelWysEditor.setVisible(true);
                labelSourceEditor.setVisible(true);
                wysEditorShow.setVisible(true);
                wysEditorHide.setVisible(true);
                sourceEditorShow.setVisible(true);
                sourceEditorHide.setVisible(true);

                sourceEditorShow.setSelected(true);

                wysEditorShow.setSelected(true);

                ActionListener actionListenerSourceEditorTab = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getSource()==sourceEditorShow){
                            editor.setEditorVisible(editor.getSourceEditor(), true);
                        }else if(e.getSource()==sourceEditorHide){
                            editor.setEditorVisible(editor.getSourceEditor(), false);
                        }
                    }
                };
                sourceEditorShow.addActionListener(actionListenerSourceEditorTab);
                sourceEditorHide.addActionListener(actionListenerSourceEditorTab);

                ActionListener actionListenerWysEditorTab = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(e.getSource()==wysEditorShow){
                            editor.setEditorVisible(editor.getVisualEditor(), true);
                        }else if(e.getSource()==wysEditorHide){
                            editor.setEditorVisible(editor.getVisualEditor(), false);
                        }
                    }
                };
                wysEditorShow.addActionListener(actionListenerWysEditorTab);
                wysEditorHide.addActionListener(actionListenerWysEditorTab);
            }
        };
        second.addActionListener(actionListenerSecondTask);



        ActionListener actionListenerThirdTask = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnButton.setVisible(true);
                first.setVisible(false);
                second.setVisible(false);
                third.setVisible(false);
                fourth.setVisible(false);
                fifth.setVisible(false);
                sixth.setVisible(false);
                labelEditorName.setText("Введите имя визуального редактора");
                labelEditorName.setVisible(true);
                appointNameVisualEditor.setVisible(true);
                acceptVisualEditorName.setVisible(true);

            }
        };
        third.addActionListener(actionListenerThirdTask);

        ActionListener actionListenerRenameVisualEditor = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==acceptVisualEditorName){
                    editor.setEditorTitle(editor.getVisualEditor(), appointNameVisualEditor.getText());
                    appointNameVisualEditor.setText("");
                }
            }
        };
        acceptVisualEditorName.addActionListener(actionListenerRenameVisualEditor);

        ActionListener actionListenerFourthTask = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnButton.setVisible(true);
                first.setVisible(false);
                second.setVisible(false);
                third.setVisible(false);
                fourth.setVisible(false);
                fifth.setVisible(false);
                sixth.setVisible(false);
                labelEditorName.setText("Введите имя html редактора");
                labelEditorName.setVisible(true);
                appointNameSourceEditor.setVisible(true);
                acceptSourceEditorName.setVisible(true);

            }
        };

        ActionListener actionListenerRenameSourseEditor = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==acceptSourceEditorName){
                    editor.setEditorTitle(editor.getSourceEditor(), appointNameSourceEditor.getText());
                    appointNameSourceEditor.setText("");
                }
            }
        };
        acceptSourceEditorName.addActionListener(actionListenerRenameSourseEditor);
        fourth.addActionListener(actionListenerFourthTask);

        ActionListener actionListenerFifthTask = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnButton.setVisible(true);
                first.setVisible(false);
                second.setVisible(false);
                third.setVisible(false);
                fourth.setVisible(false);
                fifth.setVisible(false);
                sixth.setVisible(false);
                labelDefaultFont.setVisible(true);
                changeOnDefaultFont.setVisible(true);
                ActionListener actionListenerOnChangeFont = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editor.setDefaultFont("Acadian");
                    }
                };
                changeOnDefaultFont.addActionListener(actionListenerOnChangeFont);
            }
        };
        fifth.addActionListener(actionListenerFifthTask);

        ActionListener actionListenerSixthTask = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnButton.setVisible(true);
                first.setVisible(false);
                second.setVisible(false);
                third.setVisible(false);
                fourth.setVisible(false);
                fifth.setVisible(false);
                sixth.setVisible(false);
                labelInsertText.setVisible(true);
                inputText.setVisible(true);
                insertButton.setVisible(true);
                ActionListener actionListenerOnInsertText = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editor.insertVisualText(inputText.getText());
                    }
                };
                insertButton.addActionListener(actionListenerOnInsertText);
            }
        };
        sixth.addActionListener(actionListenerSixthTask);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(returnButton);
        panel.add(first);
        panel.add(second);
        panel.add(third);
        panel.add(fourth);
        panel.add(fifth);
        panel.add(sixth);

        panel.add(paragraphCombo);
        panel.add(fontFamilyCombo);
        panel.add(fontSizeButton);
        panel.add(fontColor);
        panel.add(fontBold);
        panel.add(fontCursive);
        panel.add(fontUnderline);
        panel.add(unorderedList);
        panel.add(orderedList);
        panel.add(alignLeft);
        panel.add(alignCenter);
        panel.add(alignRight);
        panel.add(alignWidth);
        panel.add(hyperlink);
        panel.add(image);
        panel.add(table);
        panel.add(labelWysEditor);
        panel.add(wysEditorShow);
        panel.add(wysEditorHide);
        panel.add(labelSourceEditor);
        panel.add(sourceEditorShow);
        panel.add(sourceEditorHide);

        panel.add(labelEditorName);
        panel.add(appointNameVisualEditor);
        panel.add(appointNameSourceEditor);
        panel.add(acceptVisualEditorName);
        panel.add(acceptSourceEditorName);
        panel.add(labelDefaultFont);
        panel.add(changeOnDefaultFont);
        panel.add(labelInsertText);
        panel.add(inputText);
        panel.add(insertButton);
        panel.add(new JSeparator());

        frame.add(panel, BorderLayout.WEST);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(editor.getEditMenu());
        menuBar.add(editor.getFormatMenu());
        menuBar.add(editor.getInsertMenu());
        frame.setJMenuBar(menuBar);





        frame.setTitle("HTML Editor Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().add(editor);
        frame.setVisible(true);

    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch(Exception ex){}


        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new Demo2();
            }
        });
    }
}
