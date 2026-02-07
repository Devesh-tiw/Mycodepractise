#include <stdio.h>

struct student
{
    int marks;
    float attendence;
    char sex;
};

int main()
{
    struct student  s2, s3;

    struct student s1 = {23, 3.68,'M'};
    s2.marks = 51;
    s3.marks = 50;
 
   
    s2.sex = 'M';
    s3.sex = 'M';


    s2.attendence = 99.00;
    s3.attendence = 95.00;

    printf("The data of s2 is:\n");
    printf("%d\n%c\n%f\n%s\n\n", s2.marks, s2.sex, s2.attendence, __DATE__);

    printf("The data of s1 is:\n");
    printf("%d\n%c\n%f\n\n", s1.marks, s1.sex, s1.attendence);

    printf("The data of s3 is:\n");
    printf("%d\n%c\n%f\n", s3.marks, s3.sex, s3.attendence);

    return 0;
}
