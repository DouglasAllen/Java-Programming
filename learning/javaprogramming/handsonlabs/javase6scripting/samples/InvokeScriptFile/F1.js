print('Hello, world!')

// Just use Java syntax
print('\n');
var props = java.lang.System.getProperties();
print(props.get('os.name'));

// just use new JavaClass();
var fr = new javax.swing.JFrame();
// call all public methods as in Java
fr.setTitle('hello');
fr.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
fr.setSize(200, 200);
fr.setVisible(true);