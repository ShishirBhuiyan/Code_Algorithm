/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_08_Class_and_object_Deeper_Look;

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _02_play_with_date {
    public static void main(String[] args) {
        Time2 t = new Time2();
        
        System.out.print( "The initial universal time is: " ); 
        System.out.println( t.toUniversalString() );
        System.out.print( "The initial standard time is: " ); 
        System.out.println( t.toString() );
        
        
        t.setTime( 13, 27, 6 );
        System.out.print( "\nUniversal time after setTime is: " ); 
        System.out.println( t.toUniversalString() );
        System.out.print( "Standard time after setTime is: " ); 
        System.out.println( t.toString() );
        
        
        t.setTime( 99, 99, 99 );
        System.out.println( "\nAfter attempting invalid settings:" ); 
        System.out.print( "The initial universal time is: " ); 
        System.out.println( t.toUniversalString() );
        System.out.print( "The initial standard time is: " ); 
        System.out.println( t.toString() );
    }
}



class Time2{
    private int totalSeconds;
    
    
    public Time2()                      { totalSeconds = 0; }
    public Time2( int h )               { setTime( h, 0, 0 ); } 
    public Time2( int h, int m )        { setTime( h, m, 0 ); } 
    public Time2( int h, int m, int s ) { setTime( h, m, s ); }  
    
    // set a new time value using total seconds; perform 
    //validity checks on data; set invalid values to zero 
    public void setTime( int h, int m, int s ) {
        setHour( h ); 
        setMinute( m );
        setSecond( s );
    }
    
    
    
    public void setHour( int h ) {
        int hours = ( h >= 0 && h < 24 ) ? h : 0;
        totalSeconds = ( hours * 3600 ) + ( getMinute() * 60 ) + getSecond();
    }
    public void setMinute( int m ) {
        int minutes = ( m >= 0 && m < 60 ) ? m : 0;
        totalSeconds = ( getHour() * 3600 ) + ( minutes * 60 ) + getSecond();
    }
    public void setSecond( int s ) {
        int seconds = ( s >= 0 && s < 60 ) ? s : 0;
        totalSeconds = ( getHour() * 3600 ) + ( getMinute() *60 ) + seconds;
    }
    
    
    
    
    
    
   
    public int getHour() {
      return ( totalSeconds / 3600 ); 
    }
    public int getMinute() {
         return ( ( totalSeconds % 3600 ) / 60 ); 
    }
    public int getSecond() {
        return ( ( totalSeconds % 3600 ) % 60 ); 
    }
    
     
    // universal-time format (HH:MM:SS) 
    public String toUniversalString() {
        return String.format( "%02d:%02d:%02d", getHour(), getMinute(), getSecond() ); 
    }
    // standard-time format (H:MM:SS AM or PM) 
    public String toString() {
        return String.format( "%d:%02d:%02d %s",
        ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ), 
        getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
    }
}