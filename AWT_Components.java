// WAP to demonstrate awt components
//(button,textbox,textarea,checkbox,list,select menu etc.)
import java.awt.*;    
public class awt_components {    
public static void main (String[] args) {      

    Frame f = new Frame("awt_components");      
    Button b = new Button("Click Here");                    //Button 
    TextField t1;                                           //TextBox
    TextArea area = new TextArea("I am TextArea.");         //TextArea
    Checkbox checkbox = new Checkbox("CheckBox", true);     //CheckBox
    List l1 = new List(5);                                  //List
    MenuBar mb=new MenuBar();                               //Menu
    Menu menu=new Menu("Menu");  
    Menu submenu=new Menu("Sub Menu");         

    b.setBounds(50,150,80,30);    
    f.add(b);    
 
    t1 = new TextField("I am TextField.");    
    t1.setBounds(50,190,200,30);    
    f.add(t1); 

    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     

    area.setBounds(50,240,200,100);    
    f.add(area);  

    checkbox.setBounds(50,350,100,30);
    f.add(checkbox); 

    l1.setBounds(50,400,75,75);    
    l1.add("Item 1");    
    l1.add("Item 2");    
    l1.add("Item 3");    
    l1.add("Item 4");    
    l1.add("Item 5");    
    f.add(l1);   

    MenuItem i1=new MenuItem("Item 1");  
    MenuItem i2=new MenuItem("Item 2");  
    MenuItem i3=new MenuItem("Item 3");  
    MenuItem i4=new MenuItem("Item 4");  
    MenuItem i5=new MenuItem("Item 5");  
    menu.add(i1);  
    menu.add(i2);  
    menu.add(i3);  
    submenu.add(i4);  
    submenu.add(i5);  
    menu.add(submenu);  
    mb.add(menu);  
    f.setMenuBar(mb);

}    
}    
