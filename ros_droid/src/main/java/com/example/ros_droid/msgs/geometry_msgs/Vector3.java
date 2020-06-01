package com.example.ros_droid.msgs.geometry_msgs;

/**
 * A Java Bean for the Vector3 ROS geometry_msgs/Vector3 message type. This can be used both for publishing Vector3 messages to
 * {@link com.example.ros_droid.RosBridge} and unpacking Vector3 messages received from {@link com.example.ros_droid.RosBridge} (see the {@link com.example.ros_droid.tools.MessageUnpacker}
 * documentation for how to easily unpack a ROS Bridge message into a Java object).
 * @author James MacGlashan.
 */
public class Vector3 {
    public double x;
    public double y;
    public double z;

    public Vector3(){}

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
