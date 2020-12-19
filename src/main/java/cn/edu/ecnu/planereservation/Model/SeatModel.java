package cn.edu.ecnu.planereservation.Model;

public class SeatModel {
    enum SeatType{
        F, C, Y, B, K, H, L, M, Q, X, E;
    }
    protected long seat_id;
    protected SeatType type;
    protected double price;
    protected long available_count;
    protected long flight_id;
}
