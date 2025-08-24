public enum DIRECTION {
    N,
    E,
    S,
    W;
    public DIRECTION Clockwise() {
        // 获取当前枚举值的下一个索引
        int nextOrdinal = (this.ordinal() + 1) % DIRECTION.values().length;
        return DIRECTION.values()[nextOrdinal];
    }

    public DIRECTION Anticlockwise() {
        // 获取当前枚举值的下一个索引
        int nextOrdinal = (this.ordinal() - 1) % DIRECTION.values().length;
        return DIRECTION.values()[nextOrdinal];
    }
}