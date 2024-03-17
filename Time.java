package Problem2;
public class Time {

    private Integer second;
    private Integer minute;
    private Integer hour;


    Time(Integer hour,Integer minute,Integer second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public Integer getSecond(){
        return this.second;
    }
    public Integer getMinute(){
        return this.minute;
    }
    public Integer getHour(){
        return this.hour;
    }

    public void setHour(Integer hour){
        this.hour=hour;
    }
    public void setMinute(Integer minute){
        this.minute=minute;
    }
    public void setSecond(Integer second){
        this.second=second;
    }

    public void setTime(Integer hour,Integer minute,Integer second){
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);

    }

    public Time nextSecond(){
        return new Time(this.getHour(),this.getMinute(),this.getSecond()+1);
    }
    public Time prevSecond(){
        return new Time(this.getHour(),this.getMinute(),this.getSecond()-1);
    }

    @Override
    public String toString(){
        String hh;
        String mm;
        String ss;
        if(this.getHour()<10){
            hh="0"+this.getHour();
        }else{
            hh=" "+this.getHour();
        }
        if(this.getMinute()<10){
            mm="0"+this.getMinute();
        }else{
            mm=""+this.getMinute();
        }
        if(this.getSecond()<10){
            ss="0"+this.getSecond();
        }else{
            ss=""+this.getSecond();
        }
        return hh+":"+mm+":"+ss;
    }
}