����   9 |
      javax/swing/JFrame <init> ()V
  	 
   AddFrame getContentPane ()Ljava/awt/Container;	     c Ljava/awt/Container;  java/awt/FlowLayout
  
      java/awt/Container 	setLayout (Ljava/awt/LayoutManager;)V  javax/swing/JLabel  Enter ID : 
      (Ljava/lang/String;)V	  " # $ lblId Ljavax/swing/JLabel; & Enter Name : 	  ( ) $ lblName + Enter Salary : 	  - . $ 	lblSalary 0 javax/swing/JTextField
 / 2  3 (I)V	  5 6 7 txtId Ljavax/swing/JTextField;	  9 : 7 txtName	  < = 7 	txtSalary ? javax/swing/JButton A Save
 > 	  D E F btnSave Ljavax/swing/JButton; H Back	  J K F btnBack
  M N O add *(Ljava/awt/Component;)Ljava/awt/Component; Q 
AddFrame$1
 P S  T (LAddFrame;)V
 > V W X addActionListener "(Ljava/awt/event/ActionListener;)V Z 
AddFrame$2
 Y S ] Add Employee
  _ `   setTitle
  b c d setSize (II)V
  f g h setLocationRelativeTo (Ljava/awt/Component;)V
  j k 3 setDefaultCloseOperation
  m n o 
setVisible (Z)V id I name Ljava/lang/String; salary D Code LineNumberTable 
SourceFile AddFrame.java NestMembers InnerClasses                # $     ) $     . $     6 7     : 7     = 7     E F     K F     p q     r s     t u         v  �     *� **� � *� � Y� � *� Y� � !*� Y%� � '*� Y*� � ,*� /Y� 1� 4*� /Y� 1� 8*� /Y� 1� ;*� >Y@� B� C*� >YG� B� I*� *� !� LW*� *� 4� LW*� *� '� LW*� *� 8� LW*� *� ,� LW*� *� ;� LW*� *� C� LW*� *� I� LW*� I� PY*� R� U*� C� YY*� [� U*\� ^*^�� a*� e*� i*� l�    w   n           '  4  A  N  [  h  u  �  �  �   � ! � " � # � $ � % � ' � .   � � � � �  x    y z     Y P {     P       Y      