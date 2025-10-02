type Singleton struct {
    data string
}

var instance *Singleton

//in go its always pass by value even references are passed by value
func GetInstance() *Singleton {
    if (instance == nil) {
        instance = &Singleton{data: "Singleton"}
    }
    return instance
}
