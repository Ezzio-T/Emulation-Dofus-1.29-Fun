  public byte[] getChance() {
        return this.weight <= 1 ? new byte[] {0, 2, 98} : new byte[] {0, 1, 99};
    }