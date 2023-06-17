class Learn_If
{
public static void main(String[] args)

{
Learn_If li = new Learn_If();
li.find_highest_scorer(90,95);


}

void find_highest_scorer(int vk,int msd)
{
//int vk=95;
//int msd=100;
if(vk>msd)
     
{
System.out.println(vk);
}
else if(msd>vk)

{
System.out.println(msd);
}

else

{
System.out.println(vk + msd);
}


}

}
