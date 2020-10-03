package com.makotojava.ncaabb.dl4j;

import java.util.Objects;

/**
 * Uniquely identifies a team w/r/t that team's participation
 * in a particular region and round in the tournament.
 *
 * Suitable for use in Maps and Sets.
 */
public class TeamCoordinate {
  private int region;
  private int round;
  private int index;
  private String name; // optional

  public int getRegion() {
    return region;
  }

  public TeamCoordinate setRegion(final int region) {
    this.region = region;
    return this;
  }

  public int getRound() {
    return round;
  }

  public TeamCoordinate setRound(final int round) {
    this.round = round;
    return this;
  }

  public int getIndex() {
    return index;
  }

  public TeamCoordinate setIndex(final int index) {
    this.index = index;
    return this;
  }

  public String getName() {
    return name;
  }

  public TeamCoordinate setName(final String name) {
    this.name = name;
    return this;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final TeamCoordinate that = (TeamCoordinate) o;
    return region == that.region &&
      round == that.round &&
      index == that.index;
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, round, index);
  }

  @Override
  public String toString() {
    return "TeamCoordinate{" +
      "region=" + region +
      ", round=" + round +
      ", index=" + index +
      ", name='" + name + '\'' +
      '}';
  }
}