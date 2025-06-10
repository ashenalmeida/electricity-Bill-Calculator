-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2025 at 07:38 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `electricity bill`
--

-- --------------------------------------------------------

--
-- Table structure for table `calculate_bill`
--

CREATE TABLE `calculate_bill` (
  `bill_id` int(11) NOT NULL,
  `cus_id` int(50) NOT NULL,
  `nic` varchar(12) NOT NULL,
  `month` varchar(50) NOT NULL,
  `units` varchar(50) NOT NULL,
  `total` varchar(50) NOT NULL,
  `payment` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `calculate_bill`
--

INSERT INTO `calculate_bill` (`bill_id`, `cus_id`, `nic`, `month`, `units`, `total`, `payment`) VALUES
(11, 10, '200418403077', 'January', '50', '392.50', 'Not Paid'),
(12, 17, '200414403278', 'January', '30', '235.50', 'Not Paid'),
(13, 18, '200435812130', 'January', '35', '274.75', 'Paid');

-- --------------------------------------------------------

--
-- Table structure for table `customer_info`
--

CREATE TABLE `customer_info` (
  `id` int(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(150) NOT NULL,
  `nic` varchar(12) NOT NULL,
  `contact_no` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer_info`
--

INSERT INTO `customer_info` (`id`, `name`, `address`, `nic`, `contact_no`) VALUES
(15, 'Ashen', 'Aluthgama', '200418403077', '0702154418'),
(17, 'Nilusha', 'Kaluthara', '200414403278', '0752629348'),
(18, 'Malith', 'Wadduwa', '200435812130', '0769786182');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `calculate_bill`
--
ALTER TABLE `calculate_bill`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `cus_id` (`cus_id`);

--
-- Indexes for table `customer_info`
--
ALTER TABLE `customer_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `calculate_bill`
--
ALTER TABLE `calculate_bill`
  MODIFY `bill_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `customer_info`
--
ALTER TABLE `customer_info`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `calculate_bill`
--
ALTER TABLE `calculate_bill`
  ADD CONSTRAINT `calculate_bill_ibfk_1` FOREIGN KEY (`cus_id`) REFERENCES `customer_info` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
