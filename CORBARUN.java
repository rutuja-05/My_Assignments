Javac *.java
 idlj -fall  ReverseModule.idl
   javac *.java  ReverseModule/*.java
orbd -ORBInitialPort 1050&
  java ReverseServer -ORBInitialPort 1050& -ORBInitialHost localhost&
on new terminal
  java ReverseClient -ORBInitialPort 1050 -ORBInitialHost localhost

