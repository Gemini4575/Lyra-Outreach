package frc.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Lookup table for REV Blinkin LED Driver patterns (REV-11-1105).
 *
 * Each pattern has a roboRIO SPARK PWM value in the range [-1.0, 1.0] that
 * should be passed to a {@code Spark} motor controller's {@code set()} method
 * to drive the Blinkin into that pattern.
 *
 * Usage:
 *   double value = LedPattern.get("Strobe, Blue");
 *   spark.set(value);
 *
 * Pattern names are matched case-insensitively. See REV-11-1105-UM-0, section
 * 5 ("LED Pattern Table") for the full table this is derived from.
 */
public class LedPattern {

    private static final Map<String, Double> VALUES = new HashMap<>();

    private static void put(String name, double value) {
        VALUES.put(name.toLowerCase(), value);
    }

    static {
        // Fixed Palette Pattern
        put("Rainbow, Rainbow Palette", -0.99);
        put("Rainbow, Party Palette", -0.97);
        put("Rainbow, Ocean Palette", -0.95);
        put("Rainbow, Lava Palette", -0.93);
        put("Rainbow, Forest Palette", -0.91);
        put("Rainbow with Glitter", -0.89);
        put("Confetti", -0.87);
        put("Shot, Red", -0.85);
        put("Shot, Blue", -0.83);
        put("Shot, White", -0.81);
        put("Sinelon, Rainbow Palette", -0.79);
        put("Sinelon, Party Palette", -0.77);
        put("Sinelon, Ocean Palette", -0.75);
        put("Sinelon, Lava Palette", -0.73);
        put("Sinelon, Forest Palette", -0.71);
        put("Beats per Minute, Rainbow Palette", -0.69);
        put("Beats per Minute, Party Palette", -0.67);
        put("Beats per Minute, Ocean Palette", -0.65);
        put("Beats per Minute, Lava Palette", -0.63);
        put("Beats per Minute, Forest Palette", -0.61);
        put("Fire, Medium", -0.59);
        put("Fire, Large", -0.57);
        put("Twinkles, Rainbow Palette", -0.55);
        put("Twinkles, Party Palette", -0.53);
        put("Twinkles, Ocean Palette", -0.51);
        put("Twinkles, Lava Palette", -0.49);
        put("Twinkles, Forest Palette", -0.47);
        put("Color Waves, Rainbow Palette", -0.45);
        put("Color Waves, Party Palette", -0.43);
        put("Color Waves, Ocean Palette", -0.41);
        put("Color Waves, Lava Palette", -0.39);
        put("Color Waves, Forest Palette", -0.37);
        put("Larson Scanner, Red", -0.35);
        put("Larson Scanner, Gray", -0.33);
        put("Light Chase, Red", -0.31);
        put("Light Chase, Blue", -0.29);
        put("Light Chase, Gray", -0.27);
        put("Heartbeat, Red", -0.25);
        put("Heartbeat, Blue", -0.23);
        put("Heartbeat, White", -0.21);
        put("Heartbeat, Gray", -0.19);
        put("Breath, Red", -0.17);
        put("Breath, Blue", -0.15);
        put("Breath, Gray", -0.13);
        put("Strobe, Red", -0.11);
        put("Strobe, Blue", -0.09);
        put("Strobe, Gold", -0.07);
        put("Strobe, White", -0.05);

        // Color 1 Pattern
        put("Color 1, End to End Blend to Black", -0.03);
        put("Color 1, Larson Scanner", -0.01);
        put("Color 1, Light Chase", 0.01);
        put("Color 1, Heartbeat Slow", 0.03);
        put("Color 1, Heartbeat Medium", 0.05);
        put("Color 1, Heartbeat Fast", 0.07);
        put("Color 1, Breath Slow", 0.09);
        put("Color 1, Breath Fast", 0.11);
        put("Color 1, Shot", 0.13);
        put("Color 1, Strobe", 0.15);

        // Color 2 Pattern
        put("Color 2, End to End Blend to Black", 0.17);
        put("Color 2, Larson Scanner", 0.19);
        put("Color 2, Light Chase", 0.21);
        put("Color 2, Heartbeat Slow", 0.23);
        put("Color 2, Heartbeat Medium", 0.25);
        put("Color 2, Heartbeat Fast", 0.27);
        put("Color 2, Breath Slow", 0.29);
        put("Color 2, Breath Fast", 0.31);
        put("Color 2, Shot", 0.33);
        put("Color 2, Strobe", 0.35);

        // Color 1 and 2 Pattern
        put("Sparkle, Color 1 on Color 2", 0.37);
        put("Sparkle, Color 2 on Color 1", 0.39);
        put("Color Gradient, Color 1 and 2", 0.41);
        put("Beats per Minute, Color 1 and 2", 0.43);
        put("End to End Blend, Color 1 to 2", 0.45);
        put("End to End Blend", 0.47);
        put("Color 1 and Color 2 no blending", 0.49);
        put("Twinkles, Color 1 and 2", 0.51);
        put("Color Waves, Color 1 and 2", 0.53);
        put("Sinelon, Color 1 and 2", 0.55);

        // Solid Colors
        put("Hot Pink", 0.57);
        put("Dark Red", 0.59);
        put("Red", 0.61);
        put("Red Orange", 0.63);
        put("Orange", 0.65);
        put("Gold", 0.67);
        put("Yellow", 0.69);
        put("Lawn Green", 0.71);
        put("Lime", 0.73);
        put("Dark Green", 0.75);
        put("Green", 0.77);
        put("Blue Green", 0.79);
        put("Aqua", 0.81);
        put("Sky Blue", 0.83);
        put("Dark Blue", 0.85);
        put("Blue", 0.87);
        put("Blue Violet", 0.89);
        put("Violet", 0.91);
        put("White", 0.93);
        put("Gray", 0.95);
        put("Dark Gray", 0.97);
        put("Black", 0.99);
    }

    private LedPattern() {}

    /**
     * Returns the roboRIO SPARK value for the given pattern name.
     *
     * @param name pattern name, e.g. "Strobe, Blue" or "Rainbow, Ocean Palette" (case-insensitive)
     * @return the PWM value in [-1.0, 1.0] to pass to Spark.set()
     * @throws IllegalArgumentException if the name doesn't match a known pattern
     */
    public static double get(String name) {
        Double value = VALUES.get(name.toLowerCase());
        if (value == null) {
            throw new IllegalArgumentException("Unknown LED pattern: \"" + name + "\"");
        }
        return value;
    }

    /**
     * Like {@link #get(String)}, but returns {@code defaultValue} instead of throwing
     * if the pattern name isn't found.
     */
    public static double getOrDefault(String name, double defaultValue) {
        Double value = VALUES.get(name.toLowerCase());
        return value == null ? defaultValue : value;
    }

    /** Returns true if the given pattern name is recognized. */
    public static boolean exists(String name) {
        return VALUES.containsKey(name.toLowerCase());
    }

    /** Returns the full set of known pattern names (as originally cased when added). */
    public static java.util.Set<String> names() {
        return java.util.Collections.unmodifiableSet(VALUES.keySet());
    }
}