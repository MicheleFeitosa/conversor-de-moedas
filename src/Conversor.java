public record Conversor(String base_code, String target_code, String conversion_rate) {
    public Conversor(String base_code, String target_code, String conversion_rate) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public String base_code() {
        return this.base_code;
    }

    public String target_code() {
        return this.target_code;
    }

    public String conversion_rate() {
        return this.conversion_rate;
    }
}