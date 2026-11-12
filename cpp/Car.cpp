#include "Car.hpp"

// using namespace std;

// TODO: uzupelnij implementacje. Interfejs pozostaje bez zmian.
Car::Car(const std::string& make, const std::string& model, int year)
    // :make_(make), model_(model), year_(year)
{
    make_ = make;
    model_ = model;
    year_ = year;
}

std::string Car::getMake() const { return make_; }
std::string Car::getModel() const { return model_; }
int Car::getYear() const { return year_; }
int Car::getMileage() const { return mileage_; }
int Car::getAge(int currentYear) const { if(currentYear>=year_)return currentYear-year_;return -1; }
bool Car::renameModel(const std::string& newModel) {
    bool any = false;
    std::string reject = " \r\n\t";
    for (int i=0;i<newModel.size();i++) {
        if (reject.find(newModel[i])==std::string::npos) {
            any = true;
        }
    }

    if (any) {
        model_ = newModel;
    }
    return any;
}
bool Car::drive(int distance) {
    if (distance >0 && mileage_+ distance <= 1000000 ) {
        mileage_ += distance;
        return true;
    }
    return false;
}
