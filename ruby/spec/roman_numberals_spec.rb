require_relative 'spec_helper'

describe "RomanNumerals" do

  before :each do
    @numerals = RomanNumerals.new
  end

  describe "#convert_to_roman" do
    it "returns X when number is 10" do
      expect(@numerals.convert_to_roman(10)).to eq "X"
    end
  end

  describe "#convert_to_roman" do
    it "returns XI when number is 11" do
      expect(@numerals.convert_to_roman(11)).to eq "XI"
    end
  end

  describe "#convert_to_roman" do
    it "returns XVI when number is 16" do
      expect(@numerals.convert_to_roman(16)).to eq "XVI"
    end
  end

  describe "#convert_to_roman" do
    it "returns IV when number is 4" do
      expect(@numerals.convert_to_roman(4)).to eq "IV"
    end
  end

  describe "#convert_to_roman" do
    it "returns XXIV when number is 24" do
      expect(@numerals.convert_to_roman(24)).to eq "XXIV"
    end
  end

  describe "#convert_to_roman" do
    it "returns L when number is 50" do
      expect(@numerals.convert_to_roman(50)).to eq "L"
    end
  end

  describe "#convert_to_roman" do
    it "returns LXVII when number is 67" do
      expect(@numerals.convert_to_roman(67)).to eq "LXVII"
    end
  end

  describe "#convert_to_roman" do
    it "returns CIV when number is 104" do
      expect(@numerals.convert_to_roman(104)).to eq "CIV"
    end
  end

  describe "#convert_to_roman" do
    it "returns DI when number is 501" do
      expect(@numerals.convert_to_roman(501)).to eq "DI"
    end
  end

  describe "#convert_to_roman" do
    it "returns DL when number is 550" do
      expect(@numerals.convert_to_roman(550)).to eq "DL"
    end
  end

  describe "#convert_to_roman" do
    it "returns IX when number is 9" do
      expect(@numerals.convert_to_roman(9)).to eq "IX"
    end
  end

  describe "#convert_to_roman" do
    it "returns DCCCXC when number is 890" do
      expect(@numerals.convert_to_roman(890)).to eq "DCCCXC"
    end
  end

  describe "#convert_to_roman" do
    it "returns DCCVII when number is 707" do
      expect(@numerals.convert_to_roman(707)).to eq "DCCVII"
    end
  end

end