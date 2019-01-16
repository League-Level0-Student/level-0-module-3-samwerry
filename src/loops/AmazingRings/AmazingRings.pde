int x1 = 100;
int x2 = 400;


void setup(){
size(500,500);
}
void draw(){
background(#B4AFAF);
  for(int i =20; i>0; i--){
    noFill();
  ellipse(x1,250,i*10,i*10);
  }
x1++;

for(int i =20; i>0; i--){
    noFill();
  ellipse(x2,250,i*10,i*10);
} 
  x2--;
  if(x1>500){
    x1=50;
  }
  if(x2<0){
    x2=450;
}
}