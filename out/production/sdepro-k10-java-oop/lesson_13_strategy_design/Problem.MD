Problem

Quack: Quack, Squeak, Mute

Fly: FlyWithWings, FlyNoWay

Duck: MallarDuck, BabyDuck, Decoy

Controller: fly, quack

---
````
abstract class Duck {
    abstract void fly();
    abstract void quack();
````
```
class MallarDuck extends Duck
    void fly(){
    }
    void quack(){
    }

```

`````
fly(List<Duck> duckList)
    loop over duckList
        duck.fly();
`````

`````
quack(List<Duck> duckList)
    loop over duckList
        duck.quack();
`````