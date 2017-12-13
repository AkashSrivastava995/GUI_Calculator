import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.util.*;

public class CalGui extends JFrame
{ String temp;
public CalGui()
{
setSize(350,600);
setTitle("Calculator");
setVisible(true);
setLayout(new GridLayout(2,1));
getContentPane().setBackground(Color.white);

Panel p1=new Panel();
p1.setLayout(null);
p1.setBackground(Color.black);

Label header=new Label();
header.setSize(350,70);
header.setAlignment(Label.RIGHT);

JButton b1=new JButton();b1.setBounds(30,30,50,40);b1.setText(" 1 ");
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"1");
}
});
JButton b2=new JButton();b2.setBounds(90,30,50,40);b2.setText(" 2 ");
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"2");
}
});
JButton b3=new JButton();b3.setBounds(150,30,50,40);b3.setText(" 3 ");
b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"3");
}
});
JButton b4=new JButton();b4.setBounds(210,30,50,40);b4.setText(" 4 ");
b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"4");
}
});
JButton b5=new JButton();b5.setBounds(30,90,50,40);b5.setText(" 5 ");
b5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"5");
}
});
JButton b6=new JButton();b6.setBounds(90,90,50,40);b6.setText(" 6 ");
b6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"6");
}
});
JButton b7=new JButton();b7.setBounds(150,90,50,40);b7.setText(" 7 ");
b7.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"7");
}
});
JButton b8=new JButton();b8.setBounds(210,90,50,40);b8.setText(" 8 ");
b8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"8");
}
});
JButton b9=new JButton();b9.setBounds(30,150,50,40);b9.setText(" 9 ");
b9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"9");
}
});
JButton b0=new JButton();b0.setBounds(90,150,50,40);b0.setText(" 0 ");
b0.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+"0");
}
});
JButton bp1=new JButton();bp1.setBounds(270,30,50,40);bp1.setText(" + ");
bp1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){    
header.setText(header.getText()+" + ");
}
});
JButton bp2=new JButton();bp2.setBounds(270,90,50,40);bp2.setText(" - ");
bp2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+" - ");
}
});
JButton bp3=new JButton("x");bp3.setBounds(270,150,50,40);bp3.setText(" x ");
bp3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+" x ");
}
});
JButton bp4=new JButton("/");bp4.setBounds(210,150,50,40);bp4.setText(" / ");
bp4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText(header.getText()+" / ");
}
});
JButton bpf=new JButton("=");bpf.setBounds(150,150,50,40);bpf.setText(" = ");
bpf.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
{
int count,i=1,res=0;
String temp1="";
String str=header.getText();
str=str.trim();
//System.out.println(str);
do{
StringTokenizer s=new StringTokenizer(str);
count=s.countTokens();
//System.out.println("Tokens="+s.countTokens());
int a1=Integer.parseInt(s.nextToken());
//System.out.println(a1);
if(s.hasMoreTokens()){
String temp=s.nextToken();
//System.out.println(temp);
String a2=s.nextToken();
int a=Integer.parseInt(a2);
//System.out.println(a2);
int index=str.indexOf(a2);
index=index+a2.length();
String sub=str.substring(0,index);
str=str.replace(sub,"");
//System.out.println(str);

if(temp.equals("+")){ res=a1+a;}
if(temp.equals("-")){ res=a1-a;}
if(temp.equals("x")){ res=a1*a;}
if(temp.equals("/")){ res=a1/a;}
temp1=res+str;
//System.out.println(temp1);
str=temp1;
i++;}
}while(i<=count);
header.setText(temp1);
}
}
});

JButton clear=new JButton();
clear.setText("Clear");
clear.setBounds(180,210,140,40);
clear.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
header.setText("");
}
});

JButton Back=new JButton();
Back.setText("Del");
Back.setBounds(30,210,140,40);
Back.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String str=header.getText();
int len=str.length();
str=str.substring(0,len-1);
header.setText(str);
}
});

getContentPane().add(header);
getContentPane().add(p1);
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(b0);
p1.add(bp1);
p1.add(bp2);
p1.add(bp3);
p1.add(bp4);
p1.add(bpf);
p1.add(clear);
p1.add(Back);
getContentPane().revalidate();
}
public static void main(String args[])
{
CalGui cal=new CalGui();
}
}
