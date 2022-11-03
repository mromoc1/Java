public class Variables {
    private String var_string; 
    private char var_char;

    private int var_int;
    private float var_float;
    private double var_double;
    private short var_short;
    private long var_long;
    private byte var_byte;
    
    private boolean var_boolean;

    public Variables() {
        this.var_string = "Hola Mundo";
        this.var_char = 'a';

        this.var_int = 10;
        this.var_float = 10.5f;
        this.var_double = 10.5;
        this.var_short = 10;
        this.var_long = 10L;
        this.var_byte = 10;

        this.var_boolean = true;
    }
    // Getters
    public String getVar_string() { return this.var_string; }
    public char getVar_char() { return this.var_char; }
    public int getVar_int() { return this.var_int; }
    public float getVar_float() { return this.var_float; }
    public double getVar_double() { return this.var_double; }
    public short getVar_short() { return this.var_short; }
    public long getVar_long() { return this.var_long; }
    public byte getVar_byte() { return this.var_byte; }
    public boolean getVar_boolean() { return this.var_boolean; }
    // Setters
    public void setVar_string(String var_string) {this.var_string = var_string;}
    public void setVar_char(char var_char) { this.var_char = var_char; }
    public void setVar_int(int var_int) { this.var_int = var_int; }
    public void setVar_float(float var_float) { this.var_float = var_float; }
    public void setVar_double(double var_double) { this.var_double = var_double; }
    public void setVar_short(short var_short) { this.var_short = var_short; }
    public void setVar_long(long var_long) { this.var_long = var_long; }
    public void setVar_byte(byte var_byte) { this.var_byte = var_byte; }
    public void setVar_boolean(boolean var_boolean) { this.var_boolean = var_boolean; }
}
