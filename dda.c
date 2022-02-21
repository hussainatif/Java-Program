#include <stdio.h>

int main()
{
int x1,x2,y1,y2,Xnew;
float m,diff,Ynew;

printf("Enter the coordinate of first point:");
scanf("%d%d",&x1,&y1);
printf("Enter the coordinate of second point:");
scanf("%d%d",&x2,&y2);
diff=x2-x1;
m=(y2-y1)/diff;
printf("%f",m);
if(m<1)
{
printf("X-Axis is the Primary Axis:");
Ynew=y1;
Xnew=x1+1;
for(Xnew=x1+1;Xnew<x2;Xnew++)
{
Ynew=Ynew+m;
printf("%d",Xnew);
printf("\n");
printf("%f",Ynew);
printf("\n");
}
}

	
	return 0;
}
