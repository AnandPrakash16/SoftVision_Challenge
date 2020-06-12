package com.telstra.codechallenge.model;

import java.util.List;

public class UsersRespone {

	private Long total_count;
		private String incomplete_results;
		private List<Item> Items;
		/**
		 * @return the total_count
		 */
		public Long getTotal_count() {
			return total_count;
		}
		/**
		 * @param total_count the total_count to set
		 */
		public void setTotal_count(Long total_count) {
			this.total_count = total_count;
		}
		/**
		 * @return the incomplete_results
		 */
		public String getIncomplete_results() {
			return incomplete_results;
		}
		/**
		 * @param incomplete_results the incomplete_results to set
		 */
		public void setIncomplete_results(String incomplete_results) {
			this.incomplete_results = incomplete_results;
		}
		/**
		 * @return the items
		 */
		public List<Item> getItems() {
			return Items;
		}
		/**
		 * @param items the items to set
		 */
		public void setItems(List<Item> items) {
			Items = items;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "UsersRespone [total_count=" + total_count + ", incomplete_results=" + incomplete_results
					+ ", Items=" + Items + "]";
		}
		
		
		
}
