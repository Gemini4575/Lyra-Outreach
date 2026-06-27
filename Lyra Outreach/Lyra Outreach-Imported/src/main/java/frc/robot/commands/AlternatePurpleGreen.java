package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import frc.util.LedPattern;

/**
 * Alternates a Blinkin-driven Spark between solid Violet and solid Green
 * every {@code intervalSeconds} seconds. Runs until interrupted/cancelled
 * (e.g. bind it to a button's whileTrue, or schedule it for the match).
 *
 * Usage:
 *   Spark ledController = new Spark(LED_PWM_PORT);
 *   new AlternatePurpleGreen(ledController).schedule();
 *
 *   // or with a custom interval, e.g. every 1.5s:
 *   new AlternatePurpleGreen(ledController, 1.5).schedule();
 */
public class AlternatePurpleGreen extends Command {

    private static final double DEFAULT_INTERVAL_SECONDS = 2.0;

    private final Spark led;
    private final double intervalSeconds;

    private double lastSwitchTime;
    private boolean showingPurple;

    public AlternatePurpleGreen(Spark led) {
        this(led, DEFAULT_INTERVAL_SECONDS);
        
    }

    public AlternatePurpleGreen(Spark led, double intervalSeconds) {
        this.led = led;
        this.intervalSeconds = intervalSeconds;
    }

    @Override
    public void initialize() {
        showingPurple = true;
        led.set(LedPattern.get("Violet"));
        lastSwitchTime = Timer.getFPGATimestamp();
    }

    @Override
    public void execute() {
        if (Timer.getFPGATimestamp() - lastSwitchTime >= intervalSeconds) {
            showingPurple = !showingPurple;
            led.set(showingPurple ? LedPattern.get("Violet") : LedPattern.get("Green"));
            lastSwitchTime = Timer.getFPGATimestamp();
        }
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        // Leave the LEDs as-is on cancel; nothing to clean up.
    }
}