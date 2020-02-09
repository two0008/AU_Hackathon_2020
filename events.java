
public interface events {
    public String name = "";
    public String description = "";
    public int[] option1Modifiers = new int[5];
    public int[] option2Modifiers = new int[5];
    public String option1 = "";
    public String option2 = "";
    public Boolean outcome = false;

    public void setDescription(String descIn);
    public void setOption1Modifiers(int[] modIn);
    public void setOPtion2Modifiers(int[] modIn);
    public void setOption1(String optIn);
    public void setOption2(String optIn);

} 

