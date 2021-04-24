package cn.box;

public class Time {
   private long begin;
   private long end;


    public void setBegin(long begin) {
        this.begin = begin;
    }

    public void setEnd(long end) {
        this.end = end;
    }
    public String getMs(){
        String ms = "命令回显延迟：" + (end - begin) + "ms"+ "(请反复测试，出现次数最多的数值，即为准确延迟)";
        if (begin==0 && end==0){
            ms="";
        }
        setEnd(0);
        setBegin(0);
        return ms ;
    }
}
