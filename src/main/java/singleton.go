type Singleton struct {
    data string
}

var instance *Singleton

func GetInstance() *Singleton {
    if (instance == nil) {
        instance = &Singleton{data: "Singleton"}
    }
    return instance
}
